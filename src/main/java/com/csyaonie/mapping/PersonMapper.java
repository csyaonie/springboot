package com.csyaonie.mapping;

import com.csyaonie.bean.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface PersonMapper {

    @Select("select * from person where name =#{name}")
    Person select(@Param("name") String name);

    @Insert("insert into person(name) values(#{name})")
    int insert(@Param("name") String name);

}
