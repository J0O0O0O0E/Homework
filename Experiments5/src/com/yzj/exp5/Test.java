package com.yzj.exp5;

import com.yzj.exp5.entity.College;
import com.yzj.exp5.entity.Student;
import com.yzj.exp5.entity.Teacher;
import com.yzj.exp5.resource.DatabaseUtils;

import java.util.List;
import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		System.out.println("��ѯ8888(ʵ�ʲ�����)\n" + getCourseName(DatabaseUtils.getStudents(), 8888));
		System.out.println("��ѯ201001(ʵ�ʴ���)\n" + getCourseName(DatabaseUtils.getStudents(), 201001));
		System.out.println("��ѯѧ��201001��ʦ1002(��ʦʵ�ʲ�����)");
		printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
		System.out.println("��ѯѧ��201011��ʦ1001(ѧ��ʵ�ʲ�����)");
		printCollegeName(DatabaseUtils.getStudents(), 201001, 1002);
		System.out.println("��ѯѧ��201001��ʦ1001(��ʵ�ʴ���)");
		printCollegeName(DatabaseUtils.getStudents(), 201001, 1001);
	}

	/**
	 * ���ڸ���ѧ�����ϣ�ѧ����ţ�ʵ�ֻ�ȡѧ���ĵ�ʦ������ѧԺ���ơ� �κ�һ����ڻ�ʧ�ܣ���ӡ��ʽ δ֪ѧԺ
	 * 
	 * @param student
	 * @param sNumber
	 * @return
	 */
	private static String getCourseName(List<Student> student, int sNumber) {
		/*
		 * //����һ Optional<Student> stu = student.stream().filter(i -> sNumber ==
		 * i.getNumber()).findAny(); return stu.map(i -> i.getTeacher()).map(j ->
		 * j.getCollege()).orElse(new College("δ֪ѧԺ")).getName();
		 */
		// ������
		return student.stream().filter(i -> i.getNumber() == sNumber).findAny().map(Student::getTeacher)
				.map(Teacher::getCollege).map(College::getName).orElse("δ֪ѧԺ");
	}

	/**
	 * ʵ���ڸ���ѧ�������в�ѯָ�����ѧ�������ѧ����ʦ���Ϊָ����ţ���ӡ��ʽ��ʦ����ѧԺ���ơ� �κ�һ����ڻ�ʧ�ܣ���ӡ��ʽ δ֪ѧԺ
	 * 
	 * @param students
	 * @param sNumber
	 * @param tNumber
	 */
	private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
		// ����һ
		// Optional<Student> stu = students.stream().filter(i -> i.getNumber() ==
		// sNumber && i.getTeacher().getNumber() == tNumber).findAny();
		// System.out.println(stu.map(i -> i.getTeacher()).map(j ->
		// j.getCollege()).orElse(new College("δ֪ѧԺ")).getName());
		// ������
		System.out.println(students.stream()
				.filter(i -> i.getNumber() == sNumber && i.getTeacher().getNumber() == tNumber).findAny()
				.map(Student::getTeacher).map(Teacher::getCollege).map(College::getName).orElse("δ֪ѧԺ"));
	}

}
