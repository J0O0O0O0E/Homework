
/*�}Ŀ����:

�ֶ���һ������ϵ������ΪDog��������Ϊ�ߵ㹷SpottedDog��ͷǰߵ㹷UnspottedDog�࣬����Ҫ�����£�

��1���ڻ����м�¼����Ʒ��breed������weight�Լ���ɫcolor�����ԣ�����һ������show()��ʾDog��Ϣ��

��2����UnspottedDog���У�����Dog��Ĺ��췽������дshow()������ֻ��ʾ����Ʒ�֣�

��3����SpottedDog���У�������ʾ�ߵ���ɫ��spotColor���ԣ���������ĸ����ԵĹ��췽������дshow����������

��4����������࣬����ߵ㹷���󣬷ֱ���ʾ�ߵ㹷��Ʒ�֡����ء���ɫ��Ʒ�֡���ɫ���ߵ���ɫ������ǰߵ㹷������ʾ����Ʒ�֡����ء���ɫ��Ϣ��

��˵��������ߵ㹷����ͷǰߵ㹷����ʱҪ�ֱ����룬������ֵ֮���ÿո�ָ������󰴻س���ȷ�ϣ��������ݲ��ղ������ݡ���

�������˵��:

���룺
��ë 10 red white
̩�� 5 black
�����
����һֻ��ë����Ϊ10,��ɫΪred
����һֻ��ë,��ɫΪred,�ߵ���ɫΪwhite
����һֻ̩��Ȯ

*/
import java.util.*;

class Dog {
	protected String breed;
	protected String color;
	protected int weight;

	public Dog(String breed, int weight, String color) {
		super();
		this.breed = breed;
		this.color = color;
		this.weight = weight;
	}

	public void show() {

	}
}

class UnspottedDog extends Dog {

	public UnspottedDog(String breed, int weight, String color) {
		super(breed, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("����һֻ" + super.breed + "Ȯ");
	}
}

class SpottedDog extends Dog {
	private String spotColor;

	public SpottedDog(String breed, int weight, String color, String spotColor) {
		super(breed, weight, color);
		this.spotColor = spotColor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("����һֻ" + super.breed + "����Ϊ" + super.weight + ",��ɫΪ" + super.color);
		System.out.println("����һֻ" + super.breed + ",��ɫΪ" + super.color + ",�ߵ���ɫΪ" + spotColor);
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SpottedDog b = new SpottedDog(in.next(), in.nextInt(), in.next(), in.next());
		UnspottedDog a = new UnspottedDog(in.next(), in.nextInt(), in.next());
		b.show();
		a.show();
	}
}
