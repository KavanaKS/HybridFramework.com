package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyEieghthTestCase extends BaseTest {
	
		@Test
		public static void LoginTest() throws InterruptedException
		{
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\'topnav_wrapper\']/ul/li[5]/span")).click();
        System.out.println("Dining Clicked Successfully");
		}
}

