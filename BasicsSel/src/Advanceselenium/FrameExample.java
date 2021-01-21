package Advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement clickme=driver.findElement(By.id("Click"));
		clickme.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedf=driver.findElement(By.id("Click1"));
		nestedf.click();
		driver.switchTo().defaultContent();
		List<WebElement> numberofframes=driver.findElements(By.tagName("iframe"));
		int sizes=numberofframes.size();
		System.out.println("total number of iframe :"+sizes);
		driver.quit();
		

	}

}
