package com.yzj.experiment4.resource;

import com.yzj.experiment4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student> STUDENTS = create();
    private static List<Student> create() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(201001, Student.Sex.FEMALE, "������", 2010));
        students.add(new Student(201002, Student.Sex.MALE, "����", 2010));
        students.add(new Student(201103, Student.Sex.MALE, "��ѧ��", 2011));
        students.add(new Student(201104, Student.Sex.MALE, "����", 2011));
        students.add(new Student(201205, Student.Sex.FEMALE, "������", 2012));
        students.add(new Student(201206, Student.Sex.MALE, "��־��", 2012));
        return students;
    }

    public static List<Student> getStudents() {
        return STUDENTS;
    }
}

