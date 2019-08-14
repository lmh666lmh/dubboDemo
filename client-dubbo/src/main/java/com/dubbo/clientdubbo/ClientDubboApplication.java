package com.dubbo.clientdubbo;

import com.dubbo.serverdubbo.service.ElasticService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ClientDubboApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ClientDubboApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo.xml" });
		context.start();
		ElasticService service = (ElasticService) context.getBean("elasticService");
		System.out.println(service.helloDubbo("hello dubbo!"));
		context.close();

	}

}
