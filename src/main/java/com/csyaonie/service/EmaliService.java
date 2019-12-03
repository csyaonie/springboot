package com.csyaonie.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.util.Properties;

@Service
public class EmaliService {

    @Value("${mail.username}")
    private String username;

    @Value("${mail.password}")
    private String password;

    @Value("${mail.auth}")
    private String auth;

    public void sendEmail(String to,String subject,String content) throws Exception {

        Properties props=new Properties();
        props.setProperty("mail.smtp.host","smtp.163.com");
        props.setProperty("mail.smtp.username",username);
        props.setProperty("mail.smtp.password",password);
        props.setProperty("mail.smtp.defaultEncoding","UTF-8");
        props.setProperty("mail.smtp.auth","true");
        props.setProperty("mail.smtp.port","465");
        props.setProperty("mail.smtp.ssl.enable","true");

        Session session=Session.getDefaultInstance(props,new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username,auth);
            }
        });

        MimeMessage mMessageHelper=new MimeMessage(session);

        mMessageHelper.setFrom(new InternetAddress(username));

        mMessageHelper.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to,false));

        mMessageHelper.setSubject(subject);

        Multipart mainPart=new MimeMultipart();
        //part1
        BodyPart html = new MimeBodyPart();
        content="<html><body><h1>带格式的邮件"+content+"</h1></body></html>";
        html.setContent(content,"text/html;charset=UTF-8");
        mainPart.addBodyPart(html);
        //part2
        String filePath="/users/csyaonie/a.json";
        File file=new File(filePath);
        BodyPart attachmentBodyPart=new MimeBodyPart();
        DataSource dataSource=new FileDataSource(file);
        attachmentBodyPart.setDataHandler(new DataHandler(dataSource));
        attachmentBodyPart.setFileName(MimeUtility.encodeWord(file.getName()));
        mainPart.addBodyPart(attachmentBodyPart);
        mMessageHelper.setContent(mainPart);

        Transport.send(mMessageHelper);

    }

}
