package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import filecutiltiy.ReadProperty;
import listnerimplimentation.ListenerClass;

public class BaseClass  extends ListenerClass{
	public WebDriver driver;
	public static WebDriver sdriver;
	//static=it helps to create uniqe numbers that helps us to create multiple shorts
	//sdriver =is used for screenshort 

	
	
	
	
	@BeforeClass
	public void openBrowser(){
		driver = new ChromeDriver();
		sdriver = driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		ReadProperty properties = new ReadProperty();
		String url = properties.fetchproperty("url");
		driver.get(url);
		 
		
	}
	@AfterClass
	public void closeBrower() {
		//driver.quit();
		
	}
	@BeforeMethod
	public void login() {
		ReadProperty properties = new ReadProperty();
		String username = properties.fetchproperty("username");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		String password = properties.fetchproperty("password");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@AfterMethod
	public void logout() {
		
	}

}
