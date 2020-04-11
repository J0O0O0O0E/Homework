import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> s = new ArrayList<String>();
		while (true) {
			String tmp = in.next();
			if (tmp.equals("end")) {
				break;
			}
			s.add(tmp);
		}
		Collections.sort(s);
		for (String i : s) {
			System.out.print(i + " ");
		}
	}
}
