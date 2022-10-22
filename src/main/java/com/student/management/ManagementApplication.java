package com.student.management;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

//	@Bean
//			(name=“entityManagerFactory”);
	@Override
	public void run(String... args) {

//		Student student1 = new Student("Rajitha", "Sandeera","Rajitha@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Yuresh","Tharushika","Tharushika@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Manuka","banuka","banuka@gmail.com");
//		studentRepository.save(student3);
	}
}
