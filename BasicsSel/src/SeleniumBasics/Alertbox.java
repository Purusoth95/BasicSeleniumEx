package SeleniumBasics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement promptbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		promptbox.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();	
		
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		confirmbox.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("hi");
		Thread.sleep(3000);
		alert2.accept();
	
	}

}
