package week3.day2.oops;

public class CheckBoxButton extends Button{

	public void clickCheckButton() {
		
		System.out.println("check box button clicked");
	}
	
	public static void main(String[] args) {
		CheckBoxButton ck = new CheckBoxButton();
		ck.click();
		ck.clickCheckButton();

	}

}
