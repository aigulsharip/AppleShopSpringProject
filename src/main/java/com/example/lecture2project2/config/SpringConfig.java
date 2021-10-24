package com.example.lecture2project2.config;

import com.example.lecture2project2.dao.JdbcProductDao;
import com.example.lecture2project2.dao.ProductDAO;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example.lecture2project2")
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder dbBuilder = new EmbeddedDatabaseBuilder();
        return dbBuilder.setType(EmbeddedDatabaseType.H2)
                .addScripts("classpath:db/schema.sql", "classpath:db/data.sql").build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public ProductDAO productDAO() {
        JdbcProductDao dao = new JdbcProductDao();
        dao.setJdbcTemplate(jdbcTemplate());
        return dao;
    }

}
