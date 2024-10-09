package testngexamples;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.online.GitHubApi;

public class Googlesearch {
	WebDriver webDriver;
    WebDriverWait wait;
	@BeforeClass
	public void launch() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
		wait = new WebDriverWait(webDriver,60l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		webDriver.manage().window().maximize();
		webDriver.get("https://onship.app/onship");
		WebElement usernamElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		usernamElement.sendKeys("nithyanallusamy11@gmail.com");
		
		 WebElement passwordElement = webDriver.findElement(By.xpath("//input[@type='password']"));
		 passwordElement.sendKeys("Nithya@123");
		 
		WebElement submit = webDriver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

	@Test
	public void search() throws InterruptedException {
		
		 WebElement textElement =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='onship_font'])[1]")));
		 System.out.println("Element"+textElement.getText());



	}

	@AfterClass
	public void close() {
		webDriver.close();
	}

}
