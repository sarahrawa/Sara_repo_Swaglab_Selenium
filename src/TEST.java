import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TEST {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setup() {
		System.out.println("Before Test: Setting up the environment");

		driver.get("https://www.saucedemo.com/v1/");

	}

	@Test(enabled = false)
	public void testMethod() throws InterruptedException {
		System.out.println("Test: Executing test case");
		// enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Enter password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		// press on login button
		driver.findElement(By.cssSelector("[value='LOGIN']")).click();

		// add all items to the carts

		// List<WebElements>
		List<WebElement> addelements = driver.findElements(By.className("btn_primary"));

		for (int i = 0; i < addelements.size(); i++)

		{
			addelements.get(i).click();

		}
		
		Thread.sleep(3000);
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.id("first-name")).sendKeys("sara");
		driver.findElement(By.id("last-name")).sendKeys("rawashdeh");
		driver.findElement(By.id("postal-code")).sendKeys("123");
		driver.findElement(By.className("cart_button")).click();
		driver.findElement(By.className("cart_button")).click();
		
		String text=driver.findElement(By.className("complete-header")).getText();
		
		boolean checkmsg=text.contains("THANK YOU");
		SoftAssert Assert1=new SoftAssert();
		
		//Assert1.assertEquals(text,"THANK YOU FOR YOUR ORDER" );
		Assert1.assertEquals(checkmsg, true);

		
		Assert1.assertAll();

		
		


	}
	
	
	@Test(enabled=false)
	public void testMethod2() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Enter password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		// press on login button
		driver.findElement(By.cssSelector("[value='LOGIN']")).click();

		// add all items to the carts

		// List<WebElements>
		List<WebElement> addelements = driver.findElements(By.className("btn_primary"));

		for (int i = 0; i < addelements.size(); i++)

		{
			addelements.get(i).click();

		}
		
		
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.id("first-name")).sendKeys("sara");
		driver.findElement(By.id("last-name")).sendKeys("rawashdeh");
		driver.findElement(By.id("postal-code")).sendKeys("123");
		driver.findElement(By.className("cart_button")).click();
		
		//get total 
		String text=driver.findElement(By.className("summary_total_label")).getText();
		System.out.println(text);
		//split the index
		String[]split_tex=text.split("\\$");
		
		for(String i:split_tex)
		{System.out.println(i);
		
		
	
		}
		
		System.out.println(split_tex.length);
// soft assert
		double total=Double.parseDouble(split_tex[1]);
		System.out.println(" Total :"+total);
 SoftAssert  asert1=new SoftAssert();
 asert1.assertEquals(total, 140.34);

		 
		 asert1.assertAll();
		
		
	}
	@Test()

	
public void Hardassert() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Enter password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		// press on login button
		driver.findElement(By.cssSelector("[value='LOGIN']")).click();

		// add all items to the carts

		// List<WebElements>
		List<WebElement> addelements = driver.findElements(By.className("btn_primary"));

		for (int i = 0; i < addelements.size(); i++)

		{
			addelements.get(i).click();

		}
		
		
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.id("first-name")).sendKeys("sara");
		driver.findElement(By.id("last-name")).sendKeys("rawashdeh");
		driver.findElement(By.id("postal-code")).sendKeys("123");
		driver.findElement(By.className("cart_button")).click();
		
		//get total 
		String text=driver.findElement(By.className("summary_total_label")).getText();
		System.out.println(text);
		//split the index
		String[]split_tex=text.split("\\$");
		
		for(String i:split_tex)
		{System.out.println(i);
		}
		
		
		Assert.assertEquals(split_tex[1], "140.34");

		Assert.assertEquals(split_tex[1], 10.);
		Assert.assertEquals(false,false);

		}
	
	@AfterTest
	public void teardown() {
		System.out.println("After Test: Cleaning up after test");
	}
}
