package week3.day2.oops;

public class TestData {
	String userName;
	String passWord;
	
	public void enterCredentials() {
		
		System.out.println("Enter your credentials::::   ");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigated to HomePage successfully   ");
	}

	public static void main(String[] args) {
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
		
		
	}

}
