<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${user.name}
${address}
<#if user.age=26>
    <div>26</div>
<#elseif user.age=27>
    <div>fuck</div>
<#else >
    <div>you</div>
</#if>

<#list user.list as a >
    <div>${a}</div>
</#list>
</body>
</html>