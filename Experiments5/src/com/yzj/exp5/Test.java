package com.yzj.exp5;

import com.yzj.exp5.entity.College;
import com.yzj.exp5.entity.Student;
import com.yzj.exp5.entity.Teacher;
import com.yzj.exp5.resource.DatabaseUtils;

import java.util.List;
import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		System.out.println("查询8888(实际不存在)\n" + getCourseName(DatabaseUtils.getStudents(), 8888));
		System.out.println("查询201001(实际存在)\n" + getCourseName(DatabaseUtils.getStudents(), 201001));
		System.out.println("查询学生201001教师1002(老师实际不存在)");
		printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
		System.out.println("查询学生201011教师1001(学生实际不存在)");
		printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
		System.out.println("查询学生201001教师1001(都实际存在)");
		printCollegeName(DatabaseUtils.getStudents(), 201001, 1001);
	}

	/**
	 * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。 任何一项不存在或失败，打印显式 未知学院
	 * 
	 * @param student
	 * @param sNumber
	 * @return
	 */
	private static String getCourseName(List<Student> student, int sNumber) {
		/*
		 * //方法一 Optional<Student> stu = student.stream().filter(i -> sNumber ==
		 * i.getNumber()).findAny(); return stu.map(i -> i.getTeacher()).map(j ->
		 * j.getCollege()).orElse(new College("未知学院")).getName();
		 */
		// 方法二
		return student.stream().filter(i -> i.getNumber() == sNumber).findAny().map(Student::getTeacher)
				.map(Teacher::getCollege).map(College::getName).orElse("未知学院");
	}

	/**
	 * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。 任何一项不存在或失败，打印显式 未知学院
	 * 
	 * @param students
	 * @param sNumber
	 * @param tNumber
	 */
	private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
		// 方法一
		// Optional<Student> stu = students.stream().filter(i -> i.getNumber() ==
		// sNumber && i.getTeacher().getNumber() == tNumber).findAny();
		// System.out.println(stu.map(i -> i.getTeacher()).map(j ->
		// j.getCollege()).orElse(new College("未知学院")).getName());
		// 方法二
		System.out.println(students.stream()
				.filter(i -> i.getNumber() == sNumber && i.getTeacher().getNumber() == tNumber).findAny()
				.map(Student::getTeacher).map(Teacher::getCollege).map(College::getName).orElse("未知学院"));
	}

}
