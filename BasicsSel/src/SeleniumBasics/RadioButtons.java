package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement unchecked=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		WebElement checked=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		Boolean status1=unchecked.isSelected();
		Boolean status2=checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		WebElement below20=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		below20.click();
		
		
	}

}
