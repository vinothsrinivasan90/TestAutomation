package week3.day3;

public  abstract class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delviery available");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Upi Payments done ");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking options available");
		
	}
	
	public abstract void recordPaymentDetails();
	
	

}
