package com.learning.spring_boot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Course {

    private final int courseId;
    private String courseName;
    private int creditHours;


    public Course(int courseId, String courseName, int creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", creditHours='" + creditHours + '\'' +
                '}';
    }
}
