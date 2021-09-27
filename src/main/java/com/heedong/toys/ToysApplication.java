package com.heedong.toys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 *- @SpringBootApplication
 *--- @EnableAutoConfiguration
 *------ :: 자동구성
 *--- @ComponentScan
 *------ :: 컴포넌트 및 빈 클래스 스캔하여 등록
 *--- @Configuration
 *------ :: XML -> JAVA 기반 설정 사용
 */
@SpringBootApplication
@EnableJpaAuditing
//@MapperScan // Mapper 스캔해서 스프링 컨테이너에 올림
public class ToysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToysApplication.class, args);
    }
}
