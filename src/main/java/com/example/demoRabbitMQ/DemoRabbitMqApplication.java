package com.example.demoRabbitMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoRabbitMqApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoRabbitMqApplication.class, args);

		context.getBean(MyRabbitSender.class).sendEmpMessage(new Employee(2, "nila-2"));
		context.getBean(MyRabbitSender.class).sendEmpMessage(new Employee(3, "nila-3"));
		context.getBean(MyRabbitSender.class).sendEmpMessage(new Employee(4, "nila-4"));
	}

}
