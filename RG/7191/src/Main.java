import java.util.Scanner;

/*題目內容:

编写一个模拟超市购物程序。购物时，如果购物者要购买的商品在超市中有，则提示“购物者买到了某商品”；如果没有所需的商品，则提示“购物者所需某商品无货”。该程序涉及商品、超市、购物者三个类，具体要求如下：
（1）商品类Product，包含商品名属性和set及get方法；
（2）超市类Market，包含超市名属性、存放商品的Product类型数组属性，set、get超市名的方法，能够获取商品或者存入商品的get、set方法，卖货的方法sell(String ProductName),该方法的功能是查找超市是否有所要购买的商品，如果有，则返回商品名；如果没有则返回空；
（3）购物者类Person，包含购物者姓名，set、get姓名的方法；购物的方法shopping，要求把超市名和商品名作为参数，调用Market类的sell方法返回购物结果；
（4）定义测试类Shopping，创建电视机、洗衣机、豆浆机、打印机等商品；创建超市，并将商品存入超市中；创建购物者对象，并进行购物；输入超市名和要购买的商品名，根据购物结果给出结论。

输入输出说明:

输入：家乐福 计算机
输出：张乐所需商品无货
输入：家家乐福 电视机
输出：张乐买到了电视机

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
		Product 电视机 = new Product("电视机");
		Product 洗衣机 = new Product("洗衣机");
		Product 豆浆机 = new Product("豆浆机");
		Product 打印机 = new Product("打印机");
		Product 计算机 = new Product("计算机");
		Market 家乐福 = new Market("家乐福");
		家乐福.setProduct(new Product[] { 电视机, 洗衣机, 豆浆机, 打印机 });
		Market 家家乐福 = new Market("家家乐福");
		家家乐福.setProduct(new Product[] { 电视机, 洗衣机, 豆浆机, 打印机, 计算机 });
		Person consumer = new Person();
		consumer.setName("张乐");
		String marketname = in.next();
		if (marketname.equals("家乐福")) {
			Product a = consumer.Shopping(家乐福, in.next());
			if (a != null) {
				System.out.println(consumer.getName() + "买到了" + a.getName());
			} else {
				System.out.println(consumer.getName() + "所需商品无货");
			}
		}
		if (marketname.equals("家家乐福")) {
			Product a = consumer.Shopping(家家乐福, in.next());
			if (a != null) {
				System.out.println(consumer.getName() + "买到了" + a.getName());
			} else {
				System.out.println(consumer.getName() + "所需商品无货");
			}
		}
	}
}
