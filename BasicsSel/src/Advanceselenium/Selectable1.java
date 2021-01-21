package Advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement fromeelement=element.get(6);
		WebElement toelement=element.get(0);	
	Actions action=new Actions(driver);
	action.clickAndHold(fromeelement).moveToElement(toelement).release(toelement).build().perform();
		
		
				
	}
	
}
