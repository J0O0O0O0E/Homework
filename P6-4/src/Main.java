/*
题目:

创建静态方法，传入封装User类型元素的Set集合，将集合中元素，以城市名称为键，相同城市用户集合为值，分组传入测试集合，调用测试

运行效果:

洛圣都:
	6 洛圣都 George Washington
	5 洛圣都 Ronald Reagan
--------------------------------------------
华盛顿:
	1 华盛顿 Donald Trump
	2 华盛顿 Barack Obama
--------------------------------------------
纽约:
	4 纽约 William Clinton
	3 纽约 George Bush
--------------------------------------------
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		User user1 = new User(1, "Donald Trump", "华盛顿");
		User user2 = new User(2, "Barack Obama", "华盛顿");
		User user3 = new User(3, "George Bush", "纽约");
		User user4 = new User(4, "William Clinton", "纽约");
		User user5 = new User(5, "Ronald Reagan", "洛圣都");
		User user6 = new User(6, "George Washington", "洛圣都");
		Set<User> usersSet = new HashSet<>();
		usersSet.add(user1);
		usersSet.add(user2);
		usersSet.add(user3);
		usersSet.add(user4);
		usersSet.add(user5);
		usersSet.add(user6);
		Map<String, Set<User>> map = User.SettoMap(usersSet);
		for(String i:map.keySet()) {
			System.out.println(i+":");
			Set<User> s=map.get(i);
			for(User j:s) {
				j.getInfo();
			}
			System.out.println("--------------------------------------------");
		}
	}
}

class User {
	private int id;
	private String name, city;

	public User(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public void getInfo() {
		System.out.println("\t"+getId() + " " + getCity() + " " + getName());
	}

	public static Map<String, Set<User>> SettoMap(Set<User> users) {
		Map<String, Set<User>> map = new HashMap<>();
		users.forEach(u -> {
			if (!map.containsKey(u.city)) {
				Set<User> a = new HashSet<>();
				a.add(u);
				map.put(u.city, a);
			} else {
				Set<User> a = map.get(u.city);
				a.add(u);
				map.put(u.city, a);
			}
		});
		return map;
	}
}
