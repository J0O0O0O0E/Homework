
/*�}Ŀ����:

����һ��ѧ����(Student),��������:����name������age�������й��췽����setName()������getName()������setAge()������getAge()���������������main()��������main()�����д���ѧ�����󣬹������������Ա��������ͨ������������ķ��������ѧ��������name������age��

�������˵��:

���룺���� 18
�������������������,���䣺18

*/
import java.util.*;

class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student a = new Student(input.next(), input.nextInt());
		System.out.println("����������" + a.getName() + ",���䣺" + a.getAge());
	}
}
