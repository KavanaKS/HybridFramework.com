package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MySixthTestCase extends BaseTest{
	
		@Test
		public static void LoginTest() throws InterruptedException
		{
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header']/section/div/ul[2]/li[2]/a")).click();
		System.out.println(" Bulkstore clicked Successfully");
}
}