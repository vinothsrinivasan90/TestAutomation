package week3.day2;

public class Chrome extends Browser{

	public void openIncognito() {
		
		System.out.println("cognito mode opened");
	}
	
	public void clearCache() {
		
		System.out.println("cache cleared");
	}
	
	public static void main(String[] args) {
		Chrome ch = new Chrome();
		ch.browserName="Chrome";
		ch.browserVersion=2;
		System.out.println("browser name "+ch.browserName);
		System.out.println("browser name "+ch.browserVersion);
		ch.openIncognito();
		ch.clearCache();
		ch.closeBrowser();
		

	}

}
