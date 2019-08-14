package com.dubbo.serverdubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class ServerDubboApplication {

	public static void main(String[] args) throws IOException {
//		SpringApplication.run(ServerDubboApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "dubbo.xml" });
		context.start();
		System.out.println("任意按键退出");
		System.in.read();
		context.close();

	}

}
