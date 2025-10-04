package com.example.demo.controller;


import com.example.demo.entity.CourseEntity;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/addCourse")
    public CourseEntity addCourse(@RequestBody CourseEntity course){
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse")
    public CourseEntity updateCourse(@RequestBody CourseEntity  course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse/{courseId}")
    public void deleteRecord(@PathVariable Integer courseId){
         courseService.deleteRecord(courseId);
    }


}
