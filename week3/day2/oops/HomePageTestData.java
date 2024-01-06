package week3.day2.oops;

public class HomePageTestData extends LoginTestData {

	public void homePage() {
		
		System.out.println("Home page logged in");
	}
	
	public void backHome() {
		System.out.println("Back home Page");
		
	}
	
	public static void main(String[] args) {
		HomePageTestData htd = new HomePageTestData();
		htd.enterCredentials();
		htd.userName="VKS";
		htd.passWord="tt123";
		htd.UserName();
		htd.PassWord();
		htd.homePage();
		htd.backHome();
		

	}

}
