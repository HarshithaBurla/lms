package com.example.lms1.controller;

import com.example.lms1.model.Course;
import com.example.lms1.model.User;
import com.example.lms1.service.CourseService;
import com.example.lms1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final UserService userService;
    private final CourseService courseService;

    public HomeController(UserService userService, CourseService courseService) {
        this.userService = userService;
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String getHome(Model model) {
        List<User> users = userService.getAllUsers();
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("users", users);
        model.addAttribute("courses", courses);
        return "index";
    }
}
