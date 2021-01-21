package Advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement auto=driver.findElement(By.id("tags"));
		auto.sendKeys("s");
		
		List<WebElement> moreauto=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		int numberofauto=moreauto.size();
		System.out.println("numberofauto :"+numberofauto);
		
		for (WebElement webElement : moreauto) {
			if(webElement.getText().equalsIgnoreCase("web services")){
			webElement.click();
			System.out.println("Selecting "+webElement.getText());
			break;
			}
		}
		
		
	}

}
