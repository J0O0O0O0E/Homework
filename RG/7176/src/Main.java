
/*�}Ŀ����:

��дһ����ʦ���εĳ���������ʦ�����й�ͬ�Ľ��η��������ǲ�ͬ��Ŀ�Ľ�ʦ�������ݲ�ͬ���������б�дһ�����εķ���TeachingRace(Teacher t),��ʾ��ͬ����ʦt���ڲ�ͬ�Ŀγ����ݡ���ʾ��
��1��������ʦ���й�ͬ�Ľ��η��������ڽӿ��ж���һ�����η�����
��2����ͬ��Ŀ����ʦʵ�ֽӿ��еĽ��η�����
��3�����������ж���һ�����εķ���TeachingRace(Teacher t)�����첻ͬ�Ľ�ʦ����ʾ�������ݡ���Ҫ����ӿڻص���

�������˵��:

���룺
ABC ���������
�����
����Ӣ����ʦ��I say ABC
������ѧ��ʦ��I say ���������

*/
import java.util.Scanner;

interface Teacher {
	void Teach();
}

public class Main {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		class Show {
			void TeacherRacing(Teacher t) {
				t.Teach();
			}
		}
		Show teacher = new Show();
		teacher.TeacherRacing(new Teacher() {
			public void Teach() {
				System.out.println("����Ӣ����ʦ��I say " + in.next());
			}
		});
		teacher.TeacherRacing(new Teacher() {
			public void Teach() {
				System.out.println("������ѧ��ʦ��I say " + in.next());
			}
		});
		in.close();
	}
}
