package Advanceselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		String oldwindow=driver.getWindowHandle();
		WebElement newwindow=driver.findElement(By.id("home"));
		newwindow.click();
		Set<String> newwindows=driver.getWindowHandles();
		for (String newwindows1: newwindows) {
			driver.switchTo().window(newwindows1);			
		}
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		edit.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		
		WebElement multiplewindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiplewindow.click();
		int numberofwindows=driver.getWindowHandles().size();
		System.out.println("numberof windwos :"+numberofwindows);
		
		WebElement dontclose=driver.findElement(By.xpath("//*[@id=\'color\']"));
		dontclose.click();
		Set<String>childwindows=driver.getWindowHandles();
		for (String allwindow : childwindows) {
			if(!allwindow.equals(oldwindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
				
				
				
			}
			
		}
		
		
		
		

	}

}
