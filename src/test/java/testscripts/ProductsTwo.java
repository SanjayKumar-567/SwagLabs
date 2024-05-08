package testscripts;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class ProductsTwo extends BaseClass {
	

	public void sampleTest() {
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[2]")).click();

		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[3]")).click();

		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[4]")).click();

		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[5]")).click();

		
		driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']//following::button[6]")).click();




	}

	}
	
