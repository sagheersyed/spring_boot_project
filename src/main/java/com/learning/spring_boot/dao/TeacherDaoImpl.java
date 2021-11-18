package com.learning.spring_boot.dao;

import com.learning.spring_boot.model.Course;
import com.learning.spring_boot.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeacherDaoImpl implements TeacherDao{
    List<Teacher> teacherList = new ArrayList<>();

//    List<Course> courseList = new ArrayList<>();
    @Override
    public Teacher addTeacher(Teacher teacher) {
        teacherList.add(new Teacher(teacher.getId() , teacher.getName() , teacher.getCourses()));
        return teacher;
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherList;
    }

    @Override
    public Teacher getTeacher(int id, Teacher teacher) {
        for (Teacher teacher1: teacherList) {
            if(teacher1.getId() == id){
                teacher = teacher1;
            }
        }
        return teacher;
    }

    @Override
    public Teacher updateTeacher(int id, Teacher teacher) {
        for (Teacher teacher1:teacherList) {
            if (teacher1.getId() == id){
                teacher1.setName(teacher.getName());
                teacher1.setCourses(teacher.getCourses());
            }
        }
        return teacher;
    }

    @Override
    public Teacher deleteTeacher(int id, Teacher teacher) {
        for (Teacher teacher1:teacherList) {
            if (teacher1.getId() == id){
                teacherList.remove(teacher1);
            }
        }
        return teacher;
    }
}
