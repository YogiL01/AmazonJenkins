package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(description = "Login to Amazon")
	public void loginToAmazon() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_win_103.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
//		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		driver.quit();
	}

}
