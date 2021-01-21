package Advanceselenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\85\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement download=driver.findElement(By.partialLinkText("Download Excel"));
		download.click();
		
		File filelocation=new File("C:\\Users\\purushoth\\Downloads");
		
		
		File[] totalfiles=filelocation.listFiles();
		for (File file : totalfiles) {
			if(file.getName().equals("testleaf (1).xlsx")) {
				System.out.println("files is download");
				break;
				
			}
			
		}
			
		
		
	}

}
