package com.learning.spring_boot.controllers;

import com.learning.spring_boot.model.Course;
import com.learning.spring_boot.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/course")
public class CourseController {

    public final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/post")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourse(Course course , @PathVariable("id")  int id){
        return courseService.getCourse(id , course);
    }

}
