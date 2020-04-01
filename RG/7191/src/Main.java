import java.util.Scanner;

/*�}Ŀ����:

��дһ��ģ�ⳬ�й�����򡣹���ʱ�����������Ҫ�������Ʒ�ڳ������У�����ʾ������������ĳ��Ʒ�������û���������Ʒ������ʾ������������ĳ��Ʒ�޻������ó����漰��Ʒ�����С������������࣬����Ҫ�����£�
��1����Ʒ��Product��������Ʒ�����Ժ�set��get������
��2��������Market���������������ԡ������Ʒ��Product�����������ԣ�set��get�������ķ������ܹ���ȡ��Ʒ���ߴ�����Ʒ��get��set�����������ķ���sell(String ProductName),�÷����Ĺ����ǲ��ҳ����Ƿ�����Ҫ�������Ʒ������У��򷵻���Ʒ�������û���򷵻ؿգ�
��3����������Person������������������set��get�����ķ���������ķ���shopping��Ҫ��ѳ���������Ʒ����Ϊ����������Market���sell�������ع�������
��4�����������Shopping���������ӻ���ϴ�»�������������ӡ������Ʒ���������У�������Ʒ���볬���У����������߶��󣬲����й�����볬������Ҫ�������Ʒ�������ݹ������������ۡ�

�������˵��:

���룺���ָ� �����
���������������Ʒ�޻�
���룺�Ҽ��ָ� ���ӻ�
������������˵��ӻ�

*/
class Product {
	private String name;

	public Product(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Market {
	String name;
	Product products[];

	public Market(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product[] getProduct() {
		return products;
	}

	public void setProduct(Product[] product) {
		this.products = product;
	}

	public Product sell(String ProductName) {
		for (Product i : products) {
			if (ProductName.equals(i.getName())) {
				return i;
			}
		}
		return null;
	}

}

class Person {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product Shopping(Market market, String productname) {
		return market.sell(productname);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Product ���ӻ� = new Product("���ӻ�");
		Product ϴ�»� = new Product("ϴ�»�");
		Product ������ = new Product("������");
		Product ��ӡ�� = new Product("��ӡ��");
		Product ����� = new Product("�����");
		Market ���ָ� = new Market("���ָ�");
		���ָ�.setProduct(new Product[] { ���ӻ�, ϴ�»�, ������, ��ӡ�� });
		Market �Ҽ��ָ� = new Market("�Ҽ��ָ�");
		�Ҽ��ָ�.setProduct(new Product[] { ���ӻ�, ϴ�»�, ������, ��ӡ��, ����� });
		Person consumer = new Person();
		consumer.setName("����");
		String marketname = in.next();
		if (marketname.equals("���ָ�")) {
			Product a = consumer.Shopping(���ָ�, in.next());
			if (a != null) {
				System.out.println(consumer.getName() + "����" + a.getName());
			} else {
				System.out.println(consumer.getName() + "������Ʒ�޻�");
			}
		}
		if (marketname.equals("�Ҽ��ָ�")) {
			Product a = consumer.Shopping(�Ҽ��ָ�, in.next());
			if (a != null) {
				System.out.println(consumer.getName() + "����" + a.getName());
			} else {
				System.out.println(consumer.getName() + "������Ʒ�޻�");
			}
		}
	}
}
