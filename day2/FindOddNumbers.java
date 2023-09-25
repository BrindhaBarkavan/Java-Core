package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange = 10;
		for(int iter=1;iter<=maxRange;iter++) {
			if(iter % 2 == 1) {
				System.out.println(iter+" is odd number");
			}
		}
	}

}
