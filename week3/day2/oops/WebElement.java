package week3.day2.oops;

public class WebElement {
	
	
	public void click() {
		
		System.out.println("Element clicked");
	}
	public void setText(String T) {
		System.out.println(T);
		
	}
	public static void main(String[] args) {
		WebElement el = new WebElement();
		el.click();

	}

}
