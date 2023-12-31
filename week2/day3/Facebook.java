package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

  public static void main(String[] args) {
	  
	  ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("testleaf.2023@gmail.com");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Tuna@321");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		WebElement findLogin = driver.findElement(By.linkText("Find your account and log in."));
        findLogin.click();
        String title = driver.getTitle();
                if(title.contains("Forgotten Password | Can't Log In | Facebook"))
        		{
        	
        	System.out.println("Title verified");
        	       	      	
        		}
        else {
        	
        	System.out.println("Not able to verify");
        }
        		
       
        
}
	
	
}
