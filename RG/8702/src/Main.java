
/*�}Ŀ����:

����Person�࣬��Ա����Ϊ���������䣬���й��췽����get/set����������NoAgesException�࣬������Ϊ���������200���׳��쳣IllegalArgumentException�����������������...��ӡ��������������������佨��Person���󣬲��Ըö���
�������˵��:

���� 300
������ֵ�Ƿ�
���� 77
����...77

*/
import java.util.Scanner;

class NoAgesException {
	NoAgesException() {
	}

	static void triangle(Person p) throws IllegalArgumentException {
		// start
		if (p.getAge() < 0 || p.getAge() > 200) {
			throw new IllegalArgumentException();
		} else {
			System.out.println(p.getName() + "..." + p.getAge());
		}
		// end
	}
}

class Person {
	// start
	int age;
	String name;

	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// end
}

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person p = new Person(s.next(), s.nextInt());
		;
		try {
			// start
			NoAgesException.triangle(p);
			// end
		} catch (IllegalArgumentException e) {
			System.out.println("������ֵ�Ƿ�");
		}
	}
}