package com.practice.hibenrateexample;

import com.practice.hibenrateexample.entities.Course;
import com.practice.hibenrateexample.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
	}

	@Autowired
	CourseRepository courseRepository;


	@Override
	public void run(String... args) throws Exception {
		Course course = courseRepository.findById(10001L);
		System.out.println(course);

	}
}
