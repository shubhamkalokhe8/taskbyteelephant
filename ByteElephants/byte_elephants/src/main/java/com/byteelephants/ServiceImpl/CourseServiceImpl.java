package com.byteelephants.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byteelephants.model.Course;
import com.byteelephants.repository.CourseRepository;
import com.byteelephants.servicei.CourseServiceI;

@Service
public class CourseServiceImpl implements CourseServiceI {
@Autowired
CourseRepository courseRepository;

@Override
public void addNewCourse(Course c) {
	courseRepository.save(c);
	
}

@Override
public List<Course> getAllCourses() {
	Iterable<Course> findAll = courseRepository.findAll();
	return (List<Course>) findAll;
}

@Override
public void deleteCourse(Integer id) {

	courseRepository.deleteById(id);
	
}

@Override
public List<Course> getAllCourses(String instructor) {
	if(instructor.equals("ascending"))
	{
		Iterable<Course> findAll = courseRepository.findAll();
		
		findAll.forEach(d->{
			d.compare(d, d);
		});	
	
	}
	return null;
}

}
