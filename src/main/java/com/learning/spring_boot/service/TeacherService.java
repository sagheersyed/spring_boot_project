package com.learning.spring_boot.service;

import com.learning.spring_boot.dao.TeacherDao;
import com.learning.spring_boot.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    public final TeacherDao teacherDao;

    @Autowired
    public TeacherService(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public Teacher addTeacher(Teacher teacher){
        return teacherDao.addTeacher(teacher);
    }

    public List<Teacher> getAllTeachers(){
        return teacherDao.getAllTeacher();
    }

    public Teacher getTeacher(int id , Teacher teacher){
        return teacherDao.getTeacher(id , teacher);
    }

    public Teacher deleteTeacher(int id , Teacher teacher){
        return teacherDao.deleteTeacher(id , teacher);
    }

    public Teacher updateTeacher(int id , Teacher teacher){
        return teacherDao.updateTeacher(id , teacher);
    }
}
