package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity

@Table(name = "course")
public class CourseEntity {
    @Id
    private int courseId;
   private String courseName;
   private String courseDescription;
   private String courseType;

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    //    public void setCourseType(String courseType) {
    //        this.courseType = courseType;
    //    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public String getCourseType() {
        return courseType;
    }
}
