package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student mariam = new Student("Mariam","mariam@gmail.com", LocalDate.of(2000, JANUARY,3));
            Student steve = new Student("Steve","steve@gmail.com", LocalDate.of(1996, JANUARY,3));

           repository.saveAll(List.of(mariam,steve));
        };
    }
}
