package Advanceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement>selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		Actions action=new Actions(driver);
		//action.keyDown(Keys.CONTROL).click(selectable.get(0))
		//.click(selectable.get(1))
		//.click(selectable.get(3)).build().perform();
		
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2)).build().perform();
		
	}

}
