package com.learning.spring_boot.dao;

import com.learning.spring_boot.model.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TeacherDao {

    public Teacher addTeacher(Teacher teacher);
    public List<Teacher> getAllTeacher();
    public Teacher getTeacher(int id , Teacher teacher);
    public Teacher updateTeacher(int id , Teacher teacher);
    public Teacher deleteTeacher(int id , Teacher teacher);
}
