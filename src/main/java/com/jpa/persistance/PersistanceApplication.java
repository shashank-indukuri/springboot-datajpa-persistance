package com.jpa.persistance;

import java.sql.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersistanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistanceApplication.class, args);
	}

	@Bean
	CommandLineRunner saveData(StudentRepository studentRepository) {
		return args -> {
			Student std = new Student();
			std.setStudentId("10");
			std.setFirstName("Leo");
			std.setLastName("Messi");
			std.setEmail("leo10@gmail.com");
			std.setAge(24);
			std.setAdmittedDate(new Date(2020-12-12));

			studentRepository.save(std);
		};
	}

}
