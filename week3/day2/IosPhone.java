package week3.day2;

public class IosPhone extends AndroidPhone {
	
	public void privacy() {
		
		System.out.println("Secured feature");
	}
	
public static void main(String[] args) {
	
	IosPhone iphone = new IosPhone();
	iphone.sendMsg();
	iphone.setAlarm();
	iphone.makeCall();
	iphone.privacy();
}

}
