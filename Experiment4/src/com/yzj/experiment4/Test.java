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
		System.out.println("�������ѧ��:|ѧ��|�Ա�|����|�꼶|");
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
		System.out.println("ѧ��\t�Ա�\t����\t�꼶");
		for(Student i:service.addStudent(new Student(id,sex,name,year))){
			System.out.println(i.getId()+"\t"+i.getSex()+"\t"+i.getName()+"\t"+i.getYear());
		}
	}
	public static void testListStudentsByYear() {
		System.out.println("����ɸѡ���");
		int year=in.nextInt();
		System.out.println("ѧ��\t�Ա�\t����\t�꼶");
		for(Student i:service.listStudentsByYear(year)){
			System.out.println(i.getId()+"\t"+i.getSex()+"\t"+i.getName()+"\t"+i.getYear());
		}
	}
	public static void testListStudentsNames() {
		System.out.println("����ɸѡ|���|�Ա�|");
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
		System.out.println("����");
		for(String i:service.listStudentsNames(year, sex)){
			System.out.println(i);
		}
	}
	public static void testMapStudentsBySex() {
		service.mapStudentsBySex().forEach((k,v)->{
			System.out.println("�Ա�"+k);
			for(Student j:v) {
				System.out.println("\tѧ��\t����\t�꼶");
				System.out.println("\t"+j.getId()+"\t"+j.getName()+"\t"+j.getYear());
			}
		});
	}
	public static void testRemoveStudent() {
		if(service.removeStudent(in.nextInt())==true) {
			System.out.println("ɾ���ɹ�");
		}else {
			System.out.println("ɾ��ʧ��");
		}
		for(Student i:DatabaseUtils.getStudents()){
			System.out.println(i.getId()+"\t"+i.getSex()+"\t"+i.getName()+"\t"+i.getYear());
		}
	}
}
