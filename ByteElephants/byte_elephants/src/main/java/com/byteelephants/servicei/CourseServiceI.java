package com.byteelephants.servicei;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.byteelephants.model.Course;

public interface CourseServiceI {
public void addNewCourse(Course c);
public List<Course> getAllCourses();
public void deleteCourse(@RequestParam Integer id);
public List<Course> getAllCourses(String instructor);
}
