package Advanceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement image=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		image.click();
		
		driver.navigate().back();
		
		WebElement broken=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if(broken.getAttribute("naturalwidth").equals("0")) {
			System.out.println("this image was broken image");
		}
		else {
			System.out.println("this image not broken");
		}
		
	}

}
