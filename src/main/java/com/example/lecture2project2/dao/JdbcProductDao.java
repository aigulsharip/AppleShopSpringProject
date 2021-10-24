package com.example.lecture2project2.dao;

import com.example.lecture2project2.database.Product;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

public class JdbcProductDao implements ProductDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    // Implementation of different select methods
    @Override
    public String findProductById(int id) {
        return jdbcTemplate.queryForObject(
                "select PRODUCT_NAME from product where ID = ?",
                new Object[]{id}, String.class);
    }


    @Override
    public String findProductByClientName(String client) {
        return jdbcTemplate.queryForObject(
                "select PRODUCT_NAME from service where CLIENT_NAME = ?",
                new Object[]{client}, String.class);
    }

    @Override
    public String findEmailOfClient (String name) {
        return jdbcTemplate.queryForObject(
                "select EMAIL from client where NAME = ?",
                new Object[]{name}, String.class);

    }

    public String checkAroundAdvice() {
        return "This method for checking Around Advice";
    }

}


