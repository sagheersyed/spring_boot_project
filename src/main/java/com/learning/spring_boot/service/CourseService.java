package com.learning.spring_boot.service;

import com.learning.spring_boot.dao.CourseDao;
import com.learning.spring_boot.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseService {

    private final CourseDao courseDao;

    @Autowired
    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public Course createCourse(Course course){
        return courseDao.createCourse(course);
    }

    public List<Course> getAllCourses(){
        return courseDao.getAllCourses();
    }

    public Course getCourse(int  courseID, Course course){
        return courseDao.getCourse(course , courseID);
    }

}
