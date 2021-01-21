package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement java=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		WebElement selenium=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean seleniumselected=selenium.isSelected(); 
		System.out.println(seleniumselected);
		WebElement firstelement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		firstelement.click();
		if(firstelement.isSelected()) {
			firstelement.click();
		}
		WebElement secondelement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(secondelement.isSelected()) {
			secondelement.click();
		}
		driver.close();
		
	}

}
