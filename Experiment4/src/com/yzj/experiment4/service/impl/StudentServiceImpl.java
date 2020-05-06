package com.yzj.experiment4.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.yzj.experiment4.entity.Student;
import com.yzj.experiment4.entity.Student.Sex;
import com.yzj.experiment4.resource.DatabaseUtils;
import com.yzj.experiment4.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public List<Student> addStudent(Student student) {
		DatabaseUtils.getStudents().add(student);
		return DatabaseUtils.getStudents();
	}

	@Override
	public List<Student> listStudentsByYear(int year) {
		return DatabaseUtils.getStudents().stream().filter(i->i.getYear()==year).collect(Collectors.toList());
	}

	@Override
	public List<String> listStudentsNames(int year, Sex sex) {
		return DatabaseUtils.getStudents().stream().filter(i->i.getYear()==year&&i.getSex()==sex).map(Student::getName).collect(Collectors.toList());
	}

	@Override
	public Map<Sex, List<Student>> mapStudentsBySex() {
		return DatabaseUtils.getStudents().stream().collect(Collectors.groupingBy(Student::getSex));
	}

	@Override
	public boolean removeStudent(int id) {
		for(Student i:DatabaseUtils.getStudents()) {
			if(id==i.getId()) {
				DatabaseUtils.getStudents().remove(i);
				return true;
			}
		}
		return false;
	}

}
