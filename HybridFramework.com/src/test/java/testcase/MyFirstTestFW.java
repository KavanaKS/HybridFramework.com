package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest {
	@Test
	public static void LoginTest() throws InterruptedException
	{

	System.out.println("Clicked Successfully");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > svg")).click();
    driver.findElement(By.linkText("Sign Up")).click();
    Thread.sleep(4000);
   driver.findElement(By.xpath("//*[@id='spree_user_email']")).sendKeys("kavanaks1999132gmail.com");
   
   
	} 

}
