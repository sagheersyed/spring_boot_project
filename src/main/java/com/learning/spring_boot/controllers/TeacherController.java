package com.learning.spring_boot.controllers;

import com.learning.spring_boot.model.Teacher;
import com.learning.spring_boot.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    public final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/post")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }

    @GetMapping("/ALL")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable("id") int id , Teacher teacher){
        return teacherService.getTeacher(id , teacher);
    }

    @DeleteMapping("/{id}")
    public Teacher deleteTeacher(@PathVariable int id , Teacher teacher){
        return teacherService.deleteTeacher(id , teacher);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher , @PathVariable("id") int id){
        return teacherService.updateTeacher(id , teacher);
    }
}
