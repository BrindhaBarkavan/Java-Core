package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		int previous = 0, current = 1;
		
		System.out.println("Fibonacci series within the range from 0 to "+number);
		
		for (int iter = 0;iter<number;iter++) {
			System.out.println(previous + " ");
			int next = previous+current;
			previous=current;
			current=next;
		}

	}

}
