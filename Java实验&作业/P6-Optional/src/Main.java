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
		System.out.println("课程名有");
		Meth1(new Course("math", true, new Teacher()));// 课程名有
		System.out.println("课程名空");
		Meth1(new Course(null, true, new Teacher()));// 课程名空

		System.out.println("不是选修\n" + Meth2(new Course("math", false, new Teacher())));// 不是选修
		System.out.println("是选修\n" + Meth2(new Course("math", true, new Teacher())));// 是选修

		System.out.println("选修.老师有名\n" + Meth3(new Course("math", true, new Teacher("王老师"))));// 选修.老师有名
		System.out.println("选修.老师没名\n" + Meth3(new Course("math", true, new Teacher())));// 选修.老师没名
		System.out.println("不是选修.老师有名\n" + Meth3(new Course("math", false, new Teacher("王老师"))));// 不是选修.老师有名
		System.out.println("选修,老师为空\n" + Meth3(new Course("math", true, null)));// 选修,老师为空
	}

	public static void Meth1(Course course) {// 方法1，基于指定课程，打印课程名称
		System.out.println(Optional.ofNullable(course).map(Course::getName).orElseGet(() -> "课程不存在"));
	}

	public static String Meth2(Course course) {// 方法2，基于给定课程，如果课程不是选修课，返回课程的名称任何不符合条件，返回 课程不存在
		return Optional.ofNullable(course).filter(i -> i.isElective() == false).map(Course::getName)
				.orElseGet(() -> "课程不存在");
	}

	public static String Meth3(Course course) {// 方法3，基于给定课程，如果课程是选修课，返回课程的授课教师的姓名任何不符合条件，返回 教师未知
		return Optional.ofNullable(course).filter(Course::isElective).map(Course::getTeacher).map(Teacher::getName)
				.orElseGet(() -> "教师未知");
	}
}