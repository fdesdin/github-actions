package com.example.entitieshandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Student;

@SpringBootApplication
public class EntitiesHandlerApplication {	

	public static void main(String[] args) {
		SpringApplication.run(EntitiesHandlerApplication.class, args);
		Student a = new Student("David Felipe", 33, 'M');
//		System.out.println("New Student");
		System.out.println(a);
	}

}
