package week3.day2.oops;

public class LoginTestData extends TestData {

	public void UserName() {
		
		System.out.println("Enter your user name:    "+userName);
	}
	
	public void PassWord() {
		System.out.println("Enter your PassWord:    "+passWord);
		
	}
	
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.userName="Vinoth";
		ltd.passWord="Test123";
		ltd.UserName();
		ltd.PassWord();
		

	}

}
