package week3.day2.oops;

public class TextField extends WebElement {
	
	public void getText() {
		
		System.out.println("Text retrieved ");
	}

	public static void main(String[] args) {
	 TextField td= new TextField();
	 td.click();
	 td.getText();

	}

}
