package week3.day2.oops;



public class Button extends WebElement{

	
	public void submit() {
		System.out.println("Submitted successfully");
		
	}
	
	public static void main(String[] args) {
		Button bt = new Button();
		bt.click();
		bt.submit();

	}

}
