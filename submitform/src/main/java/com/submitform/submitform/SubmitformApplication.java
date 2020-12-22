package com.submitform.submitform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication

public class SubmitformApplication {

    public static void main(String[] args)
    {
        try {
            SpringApplication.run(SubmitformApplication.class, args);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
