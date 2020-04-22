import java.util.*;
import java.util.stream.*;

class Student {
	private int number;
	private String name;
	private String clazz;
	private int score;

	public Student(int number, String name, String clazz, int score) {
		this.number = number;
		this.name = name;
		this.clazz = clazz;
		this.score = score;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getInfo() {
		return "" + getNumber() + " " + getName() + "  " + getClazz() + "  " + getScore();
	}
}

class Main {
	private static final List<Student> STUDENTS = create();
	private static final String CLAZZ1 = "���1��";
	private static final String CLAZZ2 = "���2��";

	private static List<Student> create() {
		Student s1 = new Student(2018008, "����", CLAZZ2, 66);
		Student s2 = new Student(2018005, "����", CLAZZ1, 92);
		Student s3 = new Student(2018007, "����", CLAZZ2, 42);
		Student s4 = new Student(2018006, "����", CLAZZ2, 56);
		Student s5 = new Student(2018002, "����", CLAZZ1, 81);
		Student s6 = new Student(2018010, "ţ��", CLAZZ1, 78);

		List<Student> students = new ArrayList<>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);

		return students;
	}

	public static void main(String[] args) {
		// ����ʵ�ַ�������
		System.out.println("���е���60�ֵ�ͬѧ:");
		Meth1(60).forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2�����60�ֵ�ͬѧ:");
		Meth2(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2�����60�ֵ�ͬѧ������:");
		Meth3(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i));

		System.out.println("�ɼ��ɵ͵�������:");
		Meth4().forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2�����60�ֲ��ɼ��ɸߵ��������ͬѧ:");
		Meth5(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2�����60�ֲ��ɼ��ɸߵ��������ͬѧѧ��:");
		Meth6(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i));

		System.out.println("2�����60�ֵ�ͬѧѧ��Ϊ��ѧ������Ϊֵ��Map����:\n" + "�Ƿ���Map����:" + (Meth7(CLAZZ2, 60) instanceof Map));
		for (Map.Entry<Integer, Integer> entry : Meth7(CLAZZ2, 60).entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

// ʵ�ַ���
	public static List<Student> Meth1(int x) { // ��ȡ�ɼ�С�ڵ���ָ����������ȫ��ѧ��
		return STUDENTS.stream().filter(i -> i.getScore() <= x).collect(Collectors.toList());
	}

	public static List<Student> Meth2(String s, int x) { // ��ȡָ���༶���ɼ�С�ڵ���ָ����������ȫ��ѧ��
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x).collect(Collectors.toList());
	}

	public static List<String> Meth3(String s, int x) { // ����3����ȡָ���༶���ɼ�С�ڵ���ָ����������ȫ��ѧ����������ע�ⷵ������
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x).map(Student::getName)
				.collect(Collectors.toList());
	}

	public static List<Student> Meth4() { // ����4�����ɼ��ɵ͵������򣬷���ȫ��ѧ��
		return STUDENTS.stream().sorted(Comparator.comparing(Student::getScore)).collect(Collectors.toList());
	}

	public static List<Student> Meth5(String s, int x) { // ����5����ȡָ���༶���ɼ�С�ڵ���ָ���������ɼ��ɸߵ������򣬵�ȫ��ѧ��
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x)
				.sorted(Comparator.comparing(Student::getScore).reversed()).collect(Collectors.toList());
	}

	public static List<Integer> Meth6(String s, int x) { // ����6����ȡָ���༶���ɼ�С�ڵ���ָ���������ɼ��ɸߵ������򣬵�ȫ��ѧ����ѧ�š�ע�ⷵ������
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x)
				.sorted(Comparator.comparing(Student::getScore).reversed()).map(Student::getNumber)
				.collect(Collectors.toList());
	}

	public static Map<Integer, Integer> Meth7(String s, int x) {// ����7����ȡָ���༶���ɼ�С�ڵ���ָ����������ȫ��ѧ����ѧ��ѧ��Ϊ����ѧ������Ϊֵ��Map���飬����
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x)
				.collect(Collectors.toMap(Student::getNumber, Student::getScore));
	}
}