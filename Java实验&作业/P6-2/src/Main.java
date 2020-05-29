
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
		if (usersSet instanceof java.util.Set) {
			System.out.println("Set����:");
		}
		usersSet.forEach(u -> {
			u.getInfo();
		});
		if (User.setTolist(usersSet) instanceof java.util.List) {
			System.out.println("List����:");
		}
		User.setTolist(usersSet).forEach(u -> {
			u.getInfo();
		});
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
		System.out.println("\t" + getId() + " " + getCity() + " " + getName());
	}

	public static List<User> setTolist(Set<User> userSet) {
		List<User> users = new ArrayList<>(userSet);
		return users;
	}
}
