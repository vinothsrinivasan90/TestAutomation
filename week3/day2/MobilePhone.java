package week3.day2;

public class MobilePhone {
	
	
	
	
	public void makeCall() {
		System.out.println("To dial call");
	}
	public void sendMsg() {
		System.out.println("To send msg");
	}
	public void setAlarm() {
		System.out.println("Alarm set");
	}
	public void takeSnap() {
		
		System.out.println("To take snap");
	}
	
	
public static void main(String[] args) {
		
		MobilePhone actions = new MobilePhone();
		actions.makeCall();
		actions.sendMsg();
	}

}
