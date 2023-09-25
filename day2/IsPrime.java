package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		
		int numberToCheck=17;
		boolean flag=true;
		
		if (numberToCheck <= 1) {
			flag=false;
		}
		else if(numberToCheck<=3) {
			flag=true;
		}
		else if(numberToCheck % 2 ==0 || numberToCheck % 3 == 0) {
			flag = false;
		}
		
		for(int iter=5;iter*iter <=numberToCheck;iter+=6) {
			if(numberToCheck % iter == 0 || numberToCheck % (iter+2) == 0) {
				flag=false;
			}
		}
		
		if(flag) {
			System.out.println(numberToCheck+" is a prime number");
		}else {
			System.out.println(numberToCheck+" is not a prime number");
		}
	}

}
