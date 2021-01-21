package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("purusothaman@mail.com");
		WebElement append=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys("Hi");
		WebElement value=driver.findElement(By.name("username"));
		System.out.println(value);
		WebElement clear=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clear.clear();
		WebElement disabled=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean disable=disabled.isEnabled();
		System.out.println(disable);
		
	

	}

}
