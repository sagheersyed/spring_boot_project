package com.learning.spring_boot.dao;

import com.learning.spring_boot.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
public class CourseDaoImpl implements CourseDao{

    List<Course> courseList = new ArrayList<>();

    @Override
    public Course createCourse(Course course) {
         courseList.add(new Course(course.getCourseId() , course.getCourseName() , course.getCreditHours()));
         return course;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseList;
    }

    @Override
    public Course getCourse(Course course, int courseId) {
        for (Course course1:courseList) {
            if (course1.getCourseId() == courseId){
                course = course1;
            }
        }
        return course;
    }

    @Override
    public Course updateCourse(Course course, int courseId) {
        for (Course course1:courseList) {
            if (course1.getCourseId() == courseId){
                course1.setCourseName(course.getCourseName());
                course1.setCreditHours(course.getCreditHours());
            }
        }
        return course;
    }

    @Override
    public void deleteCourse(int courseId) {
        for (Course course1:courseList) {
            if (course1.getCourseId() == courseId){
                courseList.remove(course1);
            }
        }
    }
}
