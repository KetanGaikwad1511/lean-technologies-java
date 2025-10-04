package com.example.demo.service;

import com.example.demo.entity.CourseEntity;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<CourseEntity> getAllCourseDetails(){
         return courseRepository.findAll();
    }

    public CourseEntity addCourse(CourseEntity course) {

        return courseRepository.save(course);
    }

    public CourseEntity updateCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    public void deleteRecord(Integer courseId) {
         courseRepository.deleteById(courseId);
    }
}
