package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromerun {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://Google.co.in");
		driver.findElement(By.name("q")).sendKeys("agniprasath"+Keys.ENTER);
	WebElement link=driver.findElement(By.partialLinkText("agni"));
	Boolean status=link.isDisplayed();
		if(status) {
			System.out.println("displayed");
		}
		else {
			System.out.println("not displayed");
		}
		

	}
		
		
		

	}


