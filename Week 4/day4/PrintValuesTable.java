package week4.day4;

import java.time.Duration;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
        List <WebElement> libraryname= driver.findElements(By.xpath("//div[@class='render']//table/tbody/tr"));
        
        Set<String> libname = new LinkedHashSet<String>();
        for (int i = 1; i <=libraryname.size(); i++) {
        String libinput = driver.findElement(By.xpath("//div[@class='render']//table/tbody/tr["+i+"]/td[1]")).getText();
        libname.add(libinput);
        List<WebElement> rowValues = driver.findElements(By.xpath("//div[@class='render']//table/tbody/tr[" + i + "]/td"));
        System.out.println("Library Name: " + libname);

        // Print values in the row
        for (WebElement value : rowValues) {
            System.out.println(value.getText());
        }

        System.out.println("----------------------");;
            
            }
          
        }
        	
			
		}
        
	


