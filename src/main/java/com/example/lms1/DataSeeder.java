package com.example.lms1;

import com.example.lms1.model.Course;
import com.example.lms1.model.User;
import com.example.lms1.repository.CourseRepository;
import com.example.lms1.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final CourseRepository courseRepository;

    public DataSeeder(UserRepository userRepository, CourseRepository courseRepository) {
        this.userRepository = userRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User user = new User("Harshitha", "harshithaburla", "harshitha.burla@example.com", "password123", "ADMIN");
            userRepository.save(user);
        }

        if (courseRepository.count() == 0) {
            Course course = new Course("Introduction to Spring Boot", "A beginner's guide to Spring Boot");
            courseRepository.save(course);
        }
    }
}
