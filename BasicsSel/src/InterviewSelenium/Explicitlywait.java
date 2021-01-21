package InterviewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://85//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement profile=wait.until(ExpectedConditions.elementToBeClickable
		(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")));
		profile.click();
		
		
		
	}

}
