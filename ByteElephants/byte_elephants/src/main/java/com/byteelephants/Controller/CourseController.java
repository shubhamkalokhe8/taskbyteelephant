package com.byteelephants.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.byteelephants.model.Course;
import com.byteelephants.servicei.CourseServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/course")
public class CourseController {
@Autowired 
CourseServiceI courseServiceI;
@PostMapping("/course")
public String  postMethodName(@RequestBody Course course) {
	courseServiceI.addNewCourse(course);
    
    return "Course added successfully";
}
@GetMapping("/getCodurses")
public List<Course> getMethodName() {
	List<Course> allCourses = courseServiceI.getAllCourses();
    return  allCourses;
}
@DeleteMapping("/deleteCourse/{id}")
public String deleteCourse(@RequestParam Integer id)
{
	courseServiceI.deleteCourse(id);
	return "course delete successfully";
	
}




@GetMapping("/sortCourseById/{instructor}")
public List<Course> sortCoursesById(@RequestParam String instructor) {
	List<Course> allCourses = courseServiceI.getAllCourses(instructor);
   return allCourses;
}
}
