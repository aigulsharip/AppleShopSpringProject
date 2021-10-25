package com.example.lecture2project2.dao;

import com.example.lecture2project2.database.Product;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public interface ProductDAO {
    String findProductById(int id);
    String findProductByClientName(String name);
    String findEmailOfClient (String name);
    String checkAfterAdvice();

}
