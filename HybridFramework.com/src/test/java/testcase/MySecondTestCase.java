package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MySecondTestCase extends BaseTest{
	
		@Test
		public static void LoginTest() throws InterruptedException
		{
			
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#head-alert > div > div > a > strong")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='search']")).click();
		System.out.println("Clicked Successfully");
}
}