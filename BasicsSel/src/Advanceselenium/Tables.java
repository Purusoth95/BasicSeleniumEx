package Advanceselenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D://85//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	List<WebElement> row=driver.findElements(By.tagName("th"));
	int rowvalue=row.size();
	System.out.println("number value is row :"+rowvalue);
	List<WebElement>column=driver.findElements(By.tagName("tr"));
	int columnvalue=column.size();
	System.out.println("number value is column :"+columnvalue);
	WebElement learnt=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String learntvalue=learnt.getText();
	System.out.println("learnt progress value :"+learntvalue);
	
	List<WebElement>allprogress=driver.findElements(By.xpath("//td[2]"));
	List<Integer>numberlist=new ArrayList<Integer>();
	for (WebElement webElement : allprogress) {
		String indutualvalue=webElement.getText().replace("%", "");
		numberlist.add(Integer.parseInt(indutualvalue));		
	}
	System.out.println("total numberlist"+numberlist);
	
	Integer minumumvalue=Collections.min(numberlist);
	System.out.println(minumumvalue);
	String valueString=Integer.toString(minumumvalue)+"%";
	String xpath="//td[normalize-space()="+"\""+valueString+"\""+"]"+"//following::td[1]";
	System.out.println(xpath);
	WebElement check=driver.findElement(By.xpath(xpath));
	check.click();
	
	
	
	
	
	
		}
		
	}


