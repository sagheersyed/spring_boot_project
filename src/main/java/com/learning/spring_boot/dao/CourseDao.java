package com.learning.spring_boot.dao;

import com.learning.spring_boot.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

public interface CourseDao {
    public Course createCourse(Course course);
    public List<Course> getAllCourses();
    public Course getCourse(Course course , int courseId);
    public Course updateCourse(Course course , int courseId);
    public void deleteCourse(int courseId);
}
