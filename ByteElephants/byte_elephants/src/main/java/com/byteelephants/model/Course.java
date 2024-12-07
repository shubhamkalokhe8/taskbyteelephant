package com.byteelephants.model;

import java.util.Comparator;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Comparator<Course> {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
@NotNull
private String courseNameString;
@NotNull
private Double fee;
@NotNull
private String instror;
public void compare(Integer id2, Integer id3) {
	// TODO Auto-generated method stub
	
}
@Override
public int compare(Course o1, Course o2) {
return (o1.getId()-o2.getId());
	
}
}

