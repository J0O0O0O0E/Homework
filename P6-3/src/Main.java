
import java.util.*;

public class Main {
	public static void main(String[] args) {
		User user1 = new User(1, "Donald Trump", "»ªÊ¢¶Ù");
		User user2 = new User(2, "Barack Obama", "»ªÊ¢¶Ù");
		User user3 = new User(3, "George Bush", "Å¦Ô¼");
		User user4 = new User(4, "William Clinton", "Å¦Ô¼");
		User user5 = new User(5, "Ronald Reagan", "ÂåÊ¥¶¼");
		User user6 = new User(6, "George Washington", "ÂåÊ¥¶¼");
		Set<User> usersSet = new HashSet<>();
		usersSet.add(user1);
		usersSet.add(user2);
		usersSet.add(user3);
		usersSet.add(user4);
		usersSet.add(user5);
		usersSet.add(user6);
		System.out.println("Ô­Set:");
		usersSet.forEach(u -> {
			u.getInfo();
		});
		usersSet = User.remove(1, usersSet);
		System.out.println("É¾³ý1ºÅ:");
		usersSet.forEach(u -> {
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

	public static Set<User> remove(int id, Set<User> users) {
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			User user = it.next();
			if (user.id == id) {
				it.remove();
			}
		}
		return users;
	}
}
