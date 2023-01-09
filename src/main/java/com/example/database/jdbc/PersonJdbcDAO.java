package com.example.database.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Person> findAll(){
        return jdbcTemplate.query("select * from PERSON",new BeanPropertyRowMapper<>(Person.class));

    }
}
