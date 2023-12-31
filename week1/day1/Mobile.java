package week1.day1;

public class Mobile {
	
	
	
	
	public static void main(String[] args) {
		Mobile mymobile= new Mobile();
		mymobile.makeCall();
		mymobile.sendMsg();
		System.out.println("This is my mobile");
					
	}
	
	 public void makeCall() {
		 String mobileModel ="qw";
		 Float mobileWeight=12.234f; 
		System.out.println("Mobile Model :"+mobileModel);
		System.out.println("Mobile Weight is  :"+mobileWeight);
		 
	 }


	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost =230;
		System.out.println("Whether Mobile fully charged? :"+isFullCharged);
		System.out.println(("mobile Cost is: "+mobileCost));
		
		
	}
}
