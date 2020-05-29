import java.util.Optional;

class Course {
	private String name;
	private boolean elective;
	private Teacher teacher;

	public Course(String name, boolean elective, Teacher teacher) {
		super();
		this.name = name;
		this.elective = elective;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isElective() {
		return elective;
	}

	public void setElective(boolean elective) {
		this.elective = elective;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}

class Teacher {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher() {
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}

}

public class Main {
	public static void main(String[] args) {
		System.out.println("�γ�����");
		Meth1(new Course("math", true, new Teacher()));// �γ�����
		System.out.println("�γ�����");
		Meth1(new Course(null, true, new Teacher()));// �γ�����

		System.out.println("����ѡ��\n" + Meth2(new Course("math", false, new Teacher())));// ����ѡ��
		System.out.println("��ѡ��\n" + Meth2(new Course("math", true, new Teacher())));// ��ѡ��

		System.out.println("ѡ��.��ʦ����\n" + Meth3(new Course("math", true, new Teacher("����ʦ"))));// ѡ��.��ʦ����
		System.out.println("ѡ��.��ʦû��\n" + Meth3(new Course("math", true, new Teacher())));// ѡ��.��ʦû��
		System.out.println("����ѡ��.��ʦ����\n" + Meth3(new Course("math", false, new Teacher("����ʦ"))));// ����ѡ��.��ʦ����
		System.out.println("ѡ��,��ʦΪ��\n" + Meth3(new Course("math", true, null)));// ѡ��,��ʦΪ��
	}

	public static void Meth1(Course course) {// ����1������ָ���γ̣���ӡ�γ�����
		System.out.println(Optional.ofNullable(course).map(Course::getName).orElseGet(() -> "�γ̲�����"));
	}

	public static String Meth2(Course course) {// ����2�����ڸ����γ̣�����γ̲���ѡ�޿Σ����ؿγ̵������κβ��������������� �γ̲�����
		return Optional.ofNullable(course).filter(i -> i.isElective() == false).map(Course::getName)
				.orElseGet(() -> "�γ̲�����");
	}

	public static String Meth3(Course course) {// ����3�����ڸ����γ̣�����γ���ѡ�޿Σ����ؿγ̵��ڿν�ʦ�������κβ��������������� ��ʦδ֪
		return Optional.ofNullable(course).filter(Course::isElective).map(Course::getTeacher).map(Teacher::getName)
				.orElseGet(() -> "��ʦδ֪");
	}
}