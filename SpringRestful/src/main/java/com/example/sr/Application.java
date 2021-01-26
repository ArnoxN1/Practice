package com.example.sr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dell
 * @des 运行启动springboot应用
 */
@MapperScan("com.example.sr.mapper") // 指定mapper所在位置 扫描mapper 
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);

	}

}
