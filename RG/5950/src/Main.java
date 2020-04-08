import java.util.Scanner;

interface ComputerAverage {
	// start
	public abstract double average(double[] data);
	// write your code between start and end,do not delete any code
	// end
}

class Gymnastics implements ComputerAverage {
	public double average(double[] data) {
		double sum = 0;
		double temp;
		// start

		/*
		 * int i; temp = data[0]; for(i=0;i<data.length;i++) { sum=sum+data[i];
		 * if(temp<data[i]) { temp = data[i]; } } sum=sum-temp;
		 * for(i=0;i<data.length;i++) { if(i==0||temp>data[i]) { temp = data[i]; } }
		 * sum=sum-temp;
		 */
		for (int i = 0; i < data.length; i++) {
			for (int j = 1; j < data.length - i; j++) {
				if (data[j - 1] > data[j]) {
					temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
				}
			}
		}
		for (int i = 1; i < data.length - 1; i++) {
			sum = sum + data[i];
		}
		return sum / (data.length - 2);
		// write your code between start and end,do not delete any code
		// end
	}
}

class School implements ComputerAverage {
	// start
	public double average(double[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		sum = sum / data.length;
		// write your code between start and end,do not delete any code
		// end
		return sum;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[] data = new double[n];
		for (int i = 0; i < n; i++) {
			data[i] = scan.nextDouble();
		}
		// start
		ComputerAverage g = new Gymnastics();
		// write your code between start and end,do not delete any code
		// end
		System.out.print("Gymnastics average is:");
		System.out.printf("%.2f\n", g.average(data));
		// start
		g = new School();
		// write your code between start and end,do not delete any code
		// end
		System.out.print("School average is:");
		System.out.printf("%.2f", g.average(data));
	}
}
