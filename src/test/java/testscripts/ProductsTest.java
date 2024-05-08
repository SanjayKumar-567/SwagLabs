package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;

public class ProductsTest extends BaseClass {
	@Test
	public void productest() {

		WebElement asert = driver.findElement(By.xpath("//div[text()='Products']"));
		Assert.assertEquals(asert.isDisplayed(), true);
		Reporter.log("product asert passed sucessfulluy", true);
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//button[text()='<- Back']")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//button[text()='<- Back']")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//button[text()='<- Back']")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//button[text()='<- Back']")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//button[text()='<- Back']")).click();

		driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//button[text()='<- Back']")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[5]")).click();

		driver.findElement(By.xpath("//*[name()='svg'and@data-icon='shopping-cart']")).click();

		driver.findElement(By.xpath("//a[text()='Continue Shopping']")).click();
		// driver.findElement(By.xpath("//div[text()='Sauce Labs
		// Backpack']//following::button[5]")).click();

		// String getText1 = driver.findElement(By.xpath("app_logo")).getText();
		// System.out.println(getText1);

		// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

		driver.findElement(By.xpath("//*[name()='svg'and@data-icon='shopping-cart']")).click();

		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		driver.findElement(By.id("first-name")).sendKeys("sanjay");
		driver.findElement(By.id("last-name")).sendKeys("kumar p");

		driver.findElement(By.id("postal-code")).sendKeys("600091");

		driver.findElement(By.xpath("//*[@value='CONTINUE']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.findElement(By.xpath("//a[text()='FINISH']")).click();
		String getText = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).getText();
		System.out.println(getText);

	}

}
