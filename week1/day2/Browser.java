package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser Br= new Browser();
		Br.launchBrowser("Chrome");
		Br.loadUrl();
		

	}

	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully");
		return browserName ;
		
	}
	
	
	public void loadUrl()
	
	{
	System.out.println("Application url loaded successfully");	
		
	}
	
}
