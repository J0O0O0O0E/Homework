package com.yzj.experiment4.service;

import com.yzj.experiment4.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    /**
     * �򼯺����һ��ѧ�������ص�ǰȫ��ѧ��
     * @param student
     * @return
     */
    List<Student> addStudent(Student student);

    /**
     * ����ָ�����ȫ��ѧ��
     * @param year
     * @return
     */
    List<Student> listStudentsByYear(int year);

    /**
     * ����ָ���죬ָ���Ա��ȫ��ѧ��������
     * @param year
     * @param sex
     * @return
     */
    List<String> listStudentsNames(int year, Student.Sex sex);

    /**
     * ������ѧ�������Ա����
     * @return
     */
    Map<Student.Sex, List<Student>> mapStudentsBySex();

    /**
     * ɾ��ָ��ѧ�ŵ�ѧ���������Ƿ�ɹ�ɾ��
     * @param id
     * @return
     */
    boolean removeStudent(int id);
}

