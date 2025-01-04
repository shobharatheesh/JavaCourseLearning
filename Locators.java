import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;



public class Locators {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.id("inputUsername"));
		username.sendKeys("Shobha");
		
		WebElement password = driver.findElement(By.name("inputPassword"));
		password.sendKeys("admin");
		
		WebElement signup = driver.findElement(By.className("signInBtn"));
		signup.click();
		
	
		//WebElement errormessage = driver.findElement(By.cssSelector("p.error"));
		WebElement errormessage = driver.findElement(By.className("error"));
		System.out.println(errormessage.getText());
		
       
	   driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
