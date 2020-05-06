package com.yzj.experiment4;

import java.util.Scanner;
import com.yzj.experiment4.service.impl.*;

import com.yzj.experiment4.entity.Student;
import com.yzj.experiment4.resource.DatabaseUtils;
import com.yzj.experiment4.service.StudentService;

public class Test {
	private static Scanner in = new Scanner(System.in);
	private static StudentService service = new StudentServiceImpl();
	public static void main(String[] args) {
		//testAddStudent();
		//testListStudentsByYear();
		//testListStudentsNames();
		//testMapStudentsBySex();
		testRemoveStudent();
	}
	private static void testAddStudent() {
		System.out.println("输入添加学生:|学号|性别|姓名|年级|");
		int id=in.nextInt();
		String sexstr=in.next();
		Student.Sex sex;
		switch (sexstr) {
		case "MALE": {
			sex=Student.Sex.MALE;
			break;
		}
		case "FEMALE": {
			sex=Student.Sex.FEMALE;
			break;
		}
		default:
			sex=Student.Sex.MALE;
			break;
		}
		String name=in.next();
		int year=in.nextInt();
		System.out.println("学号\t性别\t姓名\t年级");
		for(Student i:service.addStudent(new Student(id,sex,name,year))){
			System.out.println(i.getId()+"\t"+i.getSex()+"\t"+i.getName()+"\t"+i.getYear());
		}
	}
	public static void testListStudentsByYear() {
		System.out.println("输入筛选年份");
		int year=in.nextInt();
		System.out.println("学号\t性别\t姓名\t年级");
		for(Student i:service.listStudentsByYear(year)){
			System.out.println(i.getId()+"\t"+i.getSex()+"\t"+i.getName()+"\t"+i.getYear());
		}
	}
	public static void testListStudentsNames() {
		System.out.println("输入筛选|年份|性别|");
		int year=in.nextInt();
		String sexstr=in.next();
		Student.Sex sex;
		switch (sexstr) {
		case "MALE": {
			sex=Student.Sex.MALE;
			break;
		}
		case "FEMALE": {
			sex=Student.Sex.FEMALE;
			break;
		}
		default:
			sex=Student.Sex.MALE;
			break;
		}
		System.out.println("姓名");
		for(String i:service.listStudentsNames(year, sex)){
			System.out.println(i);
		}
	}
	public static void testMapStudentsBySex() {
		service.mapStudentsBySex().forEach((k,v)->{
			System.out.println("性别"+k);
			for(Student j:v) {
				System.out.println("\t学号\t姓名\t年级");
				System.out.println("\t"+j.getId()+"\t"+j.getName()+"\t"+j.getYear());
			}
		});
	}
	public static void testRemoveStudent() {
		if(service.removeStudent(in.nextInt())==true) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
		for(Student i:DatabaseUtils.getStudents()){
			System.out.println(i.getId()+"\t"+i.getSex()+"\t"+i.getName()+"\t"+i.getYear());
		}
	}
}
