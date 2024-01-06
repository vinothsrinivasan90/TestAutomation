package week3.day2.oops;

public class RadioButton extends Button{

	public void selectRadioButton(){
		
		System.out.println("Radio button selected");
		
	}
	
	public static void main(String[] args) {
		RadioButton rd= new RadioButton();
		rd.click();
		rd.submit();
		rd.selectRadioButton();

	}

}
