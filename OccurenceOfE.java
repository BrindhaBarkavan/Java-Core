package week2.day1;

public class OccurenceOfE {
	
	public static void main(String[] args) {
		
		String name = "Testleaf";
		
		int count = 0;
		
		char targetCharacter = 'e';
		
		int length = name.length();
		
		char charName = name.charAt(2);
		
		System.out.println(charName);
		
		for(int i=0;i<length;i++) {
			if(name.charAt(i) == targetCharacter) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
