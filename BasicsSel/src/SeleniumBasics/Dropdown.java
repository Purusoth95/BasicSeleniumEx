package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait();
		WebElement dropdown=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(1);
		select.selectByValue("2");
		//select.selectByVisibleText("selenium");
		List<WebElement>list=select.getOptions();
		int listoptions=list.size();
		System.out.println(listoptions);
		dropdown.sendKeys("selenium");
		WebElement dropdown2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select/option[1]"));
		Select multiselect=new Select(dropdown2);
		multiselect.selectByIndex(0);
		//multiselect.selectByValue(1);
		//multiselect.selectByIndex(2);
		driver.close();
		
		
		
		
		
	}

}
