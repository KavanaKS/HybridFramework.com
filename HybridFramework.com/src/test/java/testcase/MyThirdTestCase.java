package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyThirdTestCase extends BaseTest{
	    @Test
		public static void LoginTest() throws InterruptedException
		{
	    	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'head-alert\']/div/div/a/strong")).click();
		System.out.println("Shopnow clicked Sucessfully");
		}
}