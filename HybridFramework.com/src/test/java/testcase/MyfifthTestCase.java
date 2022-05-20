package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyfifthTestCase extends BaseTest {
        @Test
		public static void LoginTest() throws InterruptedException
		{
        	
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a")).click();
		System.out.println("Stores Clicked Successfully");
		}
}

