package com.yzj.exp5.resource;

import com.yzj.exp5.entity.College;
import com.yzj.exp5.entity.Student;
import com.yzj.exp5.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student> STUDENTS = create();

    private static List<Student> create() {
        College c1 = new College("��ϢѧԺ");
        College c2 = new College("���ù���ѧԺ");

        Teacher t1 = new Teacher(1001, "������");
        t1.setCollege(c1);
        Teacher t2 = new Teacher(1002, "��־��");
        t2.setCollege(c2);

        Student s1 = new Student(201001,"������", 2010);
        s1.setTeacher(t1);
        Student s2 = new Student(201002,"����", 2010);
        s2.setTeacher(t1);
        Student s3 = new Student(201103,"��ѧ��", 2011);
        s3.setTeacher(t2);
        Student s4 = new Student(201104,"����", 2011);
        s4.setTeacher(t2);

        List<Student> students = new ArrayList<>();
        students.add(s1); students.add(s2);
        students.add(s3); students.add(s4);
        return students;
    }

    public static List<Student> getStudents() {
        return STUDENTS;
    }



}
