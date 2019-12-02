package com.csyaonie.respository;

import com.csyaonie.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRespository extends JpaRepository<Person,Long> {
}
