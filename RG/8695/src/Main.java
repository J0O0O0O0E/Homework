
/*�}Ŀ����:

�����³����� Person,�ڳ�ʼ�������Ѿ�����

��Ҫ���дStudent�� �̳�Person�࣬��ʵ��Person��ĳ��󷽷�ʵ��showName():����ַ�����ʽΪ Iname is: xxxxxx

�������˵��:

���룺
tian
�����
I name is:tian

*/
import java.util.*;

abstract class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void showName();
}

//write your own codes
class Student extends Person {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("I name is:" + super.getName());
	}

}

public class Main {
	public static void main(String[] args) {
		String name;
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		Student s = new Student();
		s.setName(name);
		s.showName();
	}
}
