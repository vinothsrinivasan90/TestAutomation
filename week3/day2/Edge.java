package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
		
		System.out.println("Snap taken");
	}
	
	
	public void clearCookies() {
		
		System.out.println("cookies cleared");
	}
	
	public static void main(String[] args) {
		Edge ed = new Edge();
		ed.browserName="Edge";
		ed.browserVersion=2;
		System.out.println("browser name "+ed.browserName);
		System.out.println("browser name "+ed.browserVersion);
		ed.openURL();
		ed.takeSnap();
		ed.clearCookies();

	}

}
