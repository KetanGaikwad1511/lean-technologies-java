package com.example.demo.controller;


import com.example.demo.entity.CourseEntity;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/getAllCourse")
    public List<CourseEntity> getCourseDetails(){
         return courseService.getAllCourseDetails();
    }


}
