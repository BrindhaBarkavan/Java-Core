package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application Url Loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser object1 = new Browser();
		 System.out.println(object1.launchBrowser("Opera"));
		 object1.loadUrl();
	}

}
