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
	private static final String CLAZZ1 = "软件1班";
	private static final String CLAZZ2 = "软件2班";

	private static List<Student> create() {
		Student s1 = new Student(2018008, "张扬", CLAZZ2, 66);
		Student s2 = new Student(2018005, "刘飞", CLAZZ1, 92);
		Student s3 = new Student(2018007, "李明", CLAZZ2, 42);
		Student s4 = new Student(2018006, "赵勇", CLAZZ2, 56);
		Student s5 = new Student(2018002, "王磊", CLAZZ1, 81);
		Student s6 = new Student(2018010, "牛娜", CLAZZ1, 78);

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
		// 调用实现方法测试
		System.out.println("所有低于60分的同学:");
		Meth1(60).forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2班低于60分的同学:");
		Meth2(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2班低于60分的同学的姓名:");
		Meth3(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i));

		System.out.println("成绩由低到高排序:");
		Meth4().forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2班低于60分并成绩由高到低排序的同学:");
		Meth5(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i.getInfo()));

		System.out.println("2班低于60分并成绩由高到低排序的同学学号:");
		Meth6(CLAZZ2, 60).forEach(i -> System.out.println("\t" + i));

		System.out.println("2班低于60分的同学学号为键学生分数为值的Map分组:\n" + "是否是Map类型:" + (Meth7(CLAZZ2, 60) instanceof Map));
		for (Map.Entry<Integer, Integer> entry : Meth7(CLAZZ2, 60).entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

// 实现方法
	public static List<Student> Meth1(int x) { // 获取成绩小于等于指定分数，的全部学生
		return STUDENTS.stream().filter(i -> i.getScore() <= x).collect(Collectors.toList());
	}

	public static List<Student> Meth2(String s, int x) { // 获取指定班级，成绩小于等于指定分数，的全部学生
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x).collect(Collectors.toList());
	}

	public static List<String> Meth3(String s, int x) { // 方法3，获取指定班级，成绩小于等于指定分数，的全部学生的姓名。注意返回类型
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x).map(Student::getName)
				.collect(Collectors.toList());
	}

	public static List<Student> Meth4() { // 方法4，按成绩由低到高排序，返回全部学生
		return STUDENTS.stream().sorted(Comparator.comparing(Student::getScore)).collect(Collectors.toList());
	}

	public static List<Student> Meth5(String s, int x) { // 方法5，获取指定班级，成绩小于等于指定分数，成绩由高到低排序，的全部学生
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x)
				.sorted(Comparator.comparing(Student::getScore).reversed()).collect(Collectors.toList());
	}

	public static List<Integer> Meth6(String s, int x) { // 方法6，获取指定班级，成绩小于等于指定分数，成绩由高到低排序，的全部学生的学号。注意返回类型
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x)
				.sorted(Comparator.comparing(Student::getScore).reversed()).map(Student::getNumber)
				.collect(Collectors.toList());
	}

	public static Map<Integer, Integer> Meth7(String s, int x) {// 方法7，获取指定班级，成绩小于等于指定分数，的全部学生以学生学号为键，学生分数为值，Map分组，返回
		return STUDENTS.stream().filter(i -> i.getClazz().equals(s) && i.getScore() <= x)
				.collect(Collectors.toMap(Student::getNumber, Student::getScore));
	}
}