package com.yangjiaying.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

    private static Logger logger = LoggerFactory.getLogger(BookApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
        logger.info("运行成功！");
    }

}
