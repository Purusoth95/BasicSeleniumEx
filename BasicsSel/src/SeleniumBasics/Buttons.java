package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement homepage=driver.findElement(By.id("home"));
		homepage.click();
		WebElement buttons=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img"));
		buttons.click();
		WebElement position=driver.findElement(By.id("position"));
		Point xyvalue=position.getLocation();
		int xvalue=xyvalue.getX();
		int yvalue=xyvalue.getY();
		System.out.println("xvalue :"+xvalue+"yvalue :"+yvalue);
		WebElement color=driver.findElement(By.xpath("//*[@id=\"color\"]"));
		String colors=color.getCssValue("background-color");
		System.out.println(colors);
		WebElement size=driver.findElement(By.xpath("//*[@id=\'size\']"));
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("height :+"+height+"width :"+width);
		driver.close();
		
		
	
		
		
		

	}

}
