package cn.baizhi.config;

import cn.baizhi.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class BeanConfig {
    @Bean
    @Scope
    public User getUser(){
        return new User("11","22","33");
    }
    @Bean
    public Connection getCon() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax", "root", "root");
        return connection;

    }
}
