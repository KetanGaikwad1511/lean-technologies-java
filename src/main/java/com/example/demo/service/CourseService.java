package com.example.demo.service;

import com.example.demo.dto.CourseDTO;
import com.example.demo.entity.CourseEntity;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<CourseDTO> getFilterCourseDetails() {

        List<CourseEntity> courseEntity = new ArrayList<CourseEntity>();

        courseEntity = courseRepository.findAll();

        List<CourseDTO> courseDTO = new ArrayList<CourseDTO>();

        for (int i = 0; i < courseEntity.size(); i++) {
            CourseDTO cd = new CourseDTO();

            cd.setCourseName(courseEntity.get(i).getCourseName());
            cd.setCourseDescription(courseEntity.get(i).getCourseDescription());
            cd.setCourseType(courseEntity.get(i).getCourseType());

            courseDTO.add(cd);
        }
        return courseDTO;
    }
}
