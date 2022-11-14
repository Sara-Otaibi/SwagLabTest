import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyFirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MQ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String userName = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		int expectedItemsAdded = 6;
		List<WebElement> myButtons = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < myButtons.size(); i++) {
			myButtons.get(i).click();
		}
System.out.println(myButtons.size());
		//String actualItemsAdded = driver.findElement(By.tagName("buttoun")).getText();
//	int sure =	Integer.parseInt(actualItemsAdded);
	//	Assert.assertEquals(actualItemsAdded, expectedItemsAdded);

	}

}
