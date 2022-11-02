package com.loong.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AtguiguApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AtguiguApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


    }

}
