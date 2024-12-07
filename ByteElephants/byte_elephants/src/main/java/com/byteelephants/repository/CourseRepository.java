package com.byteelephants.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.byteelephants.model.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{

}
