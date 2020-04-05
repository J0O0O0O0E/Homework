
/*題目內容:

编写一个教师讲课的程序。所有老师都具有共同的讲课方法，但是不同科目的教师讲课内容不同，主程序中编写一个讲课的方法TeachingRace(Teacher t),显示不同的老师t讲授不同的课程内容。提示：
（1）所有老师具有共同的讲课方法，可在接口中定义一个讲课方法；
（2）不同科目的老师实现接口中的讲课方法；
（3）在主程序中定义一个讲课的方法TeachingRace(Teacher t)，构造不同的教师，显示讲课内容【主要考察接口回调】

输入输出说明:

输入：
ABC 方程组求解
输出：
我是英语老师，I say ABC
我是数学老师，I say 方程组求解

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
				System.out.println("我是英语老师，I say " + in.next());
			}
		});
		teacher.TeacherRacing(new Teacher() {
			public void Teach() {
				System.out.println("我是数学老师，I say " + in.next());
			}
		});
		in.close();
	}
}
