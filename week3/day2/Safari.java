package week3.day2;

public class Safari extends Edge{

	public void readerMode() {
		System.out.println("reader mode enabled");
		
	}
	public void fullScreenMode() {
		System.out.println("Full screen mode enabled");
		
	}
	
	
	
	public static void main(String[] args) {
		Safari fin= new Safari();
		fin.browserName="Safari";
		fin.browserVersion=2;
		System.out.println("browser name "+fin.browserName);
		System.out.println("browser name "+fin.browserVersion);
	    fin.openURL();
	    fin.closeBrowser();
	    fin.clearCookies();
	    fin.readerMode();
	    fin.fullScreenMode();

	}

}
