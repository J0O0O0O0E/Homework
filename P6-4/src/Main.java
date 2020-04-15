/*
��Ŀ:

������̬�����������װUser����Ԫ�ص�Set���ϣ���������Ԫ�أ��Գ�������Ϊ������ͬ�����û�����Ϊֵ�����鴫����Լ��ϣ����ò���

����Ч��:

��ʥ��:
	6 ��ʥ�� George Washington
	5 ��ʥ�� Ronald Reagan
--------------------------------------------
��ʢ��:
	1 ��ʢ�� Donald Trump
	2 ��ʢ�� Barack Obama
--------------------------------------------
ŦԼ:
	4 ŦԼ William Clinton
	3 ŦԼ George Bush
--------------------------------------------
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		User user1 = new User(1, "Donald Trump", "��ʢ��");
		User user2 = new User(2, "Barack Obama", "��ʢ��");
		User user3 = new User(3, "George Bush", "ŦԼ");
		User user4 = new User(4, "William Clinton", "ŦԼ");
		User user5 = new User(5, "Ronald Reagan", "��ʥ��");
		User user6 = new User(6, "George Washington", "��ʥ��");
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
