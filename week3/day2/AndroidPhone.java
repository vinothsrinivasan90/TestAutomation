package week3.day2;

public class AndroidPhone extends MobilePhone {
	
	
	
	public void getApps() {
		
		System.out.println("Play store");
		
	}
	
	public void navigation() {
		
		System.out.println("Maps");
	}

	public static void main(String[] args) {
		
	AndroidPhone actions = new AndroidPhone();
		actions.makeCall();
		actions.sendMsg();
		actions.getApps();
		actions.navigation();
		actions.takeSnap();
		actions.setAlarm();
		
	}
}
