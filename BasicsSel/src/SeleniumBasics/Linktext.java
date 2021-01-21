package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.partialLinkText("Go to")).click();
		driver.close();

	}

}
