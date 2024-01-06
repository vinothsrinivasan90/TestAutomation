package week3.day3;

public class Amazon extends CanaraBank{

	public void Login() {
		
		System.out.println("Logged in");
	}
	
	public void addProducts() {
		
		System.out.println("products added");
	}
	
	

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment received successfully");
		
	}
	
public static void main(String[] args) {
		Amazon order = new Amazon();
		order.Login();
		order.addProducts();
		order.cashOnDelivery();
		order.upiPayments();
		order.internetBanking();
		order.recordPaymentDetails();
		

	}

}
