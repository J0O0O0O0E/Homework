/*�}Ŀ����:

����һ�� point�࣬��������������췽����

��˳��ʵ������������

1.����һ��point��Ķ���A���ò�����x,y����ʼ������x,y�Ӽ������룩

2.����һ��point��Ķ���B����A��ʼ��B��

3.���B.GetX()��

4.����fun1()������B��Ϊfun1��ʵ�Ρ�

5.ִ�� B=fun2()��

6.��� B.GetX()��
�������˵��:

���룺
4 5
�����
4
4
1

*/ 
import java.util.Scanner; 
 class Point {
    
	private  int x;
	private  int y;
	
	public Point(int xx,int yy)	//���췽��
	{
		this.x=xx;
		this.y=yy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
   //write your code
	public static void fun1(Point p)
	{
		System.out.println(p.getX());
	}
	
	public static Point fun2()
	{
		Point A =new Point(1,2);
		return A;
	}

}
 public class Main{
    public static void main(String[] args) {
      //write your code
    	Scanner in=new Scanner(System.in);
    	Point A=new Point(in.nextInt(),in.nextInt());
    	Point B=A;
    	System.out.println(B.getX());
    	Point.fun1(B);
    	B=Point.fun2();
    	System.out.println(B.getX());
	}

}