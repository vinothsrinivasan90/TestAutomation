package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDealAction {

    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.snapdeal.com/");
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement Brand = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
        actions.moveToElement(Brand).perform();
        driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
        String shoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println("Total count of shoes: " + shoesCount);

        driver.findElement(By.xpath("//li[@class='child-cat-list cat-list ']//div[text()='Training Shoes']")).click();
        driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
        driver.findElement(By.xpath("//li[normalize-space()='Price Low To High']")).click();

        String displayPriceVariable = "display-price";
        String priceXpath = "//span[@display-price='" + displayPriceVariable + "']";
        List<WebElement> priceElements = driver.findElements(By.xpath(priceXpath));
        List<Integer> prices = new ArrayList<>();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replaceAll("[^0-9]", ""); 
            prices.add(Integer.parseInt(priceText));
        }

        boolean isSorted = isSortedAscending(prices);
        if (isSorted) {
            System.out.println("Prices are sorted correctly.");
        } else {
            System.out.println("Prices are not sorted correctly.");
        }

        
        WebElement pricedecrease = driver.findElement(By.xpath("//div[@class='filter-inner']//a[2]"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(pricedecrease, -150, 0).perform();
        
        WebElement ele =driver.findElement(By.xpath("//div[@class='filter-content ']//input[@value='White%20%26%20Blue']"));
        driver.executeScript("arguments[0].click();", ele);
        WebElement prodimg = driver.findElement(By.xpath("((//picture[@class='picture-elem'])[1])"));
        action.moveToElement(prodimg).perform();
        WebElement quickview  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='clearfix row-disc']")));
        quickview.click();
        String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        System.out.println("The price of product is  " +price);
        String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
        discount.replaceAll("[^0-9]","");
        System.out.println("Discount applied :" +discount);
        WebElement proddetails = driver.findElement(By.xpath("//div[@class='comp-quickview']/div"));
	    File Scr = proddetails.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/snapdealproductdetails.png");
		FileUtils.copyFile(Scr, target);
        driver.close();
        driver.quit();
    }

    private static boolean isSortedAscending(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return list.equals(sortedList);
    }
}
