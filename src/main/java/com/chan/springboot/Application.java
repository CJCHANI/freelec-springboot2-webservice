package com.chan.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing // 1.JPA Auditing 활성화 // 2. @EnableJpaAuditing과 @SpringBootApplication 분리
// config패키지에 @EnableJpaAuditing추가
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}

// Cannot lock execution history cache (D:\freelec-springboot2-webservice\.gradle\7.1\executionHistory) as it has already been locked by this process.
//