package Advanceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement from =driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		//action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		action.dragAndDrop(from, to).build().perform();
		driver.close();
		

	}

}
