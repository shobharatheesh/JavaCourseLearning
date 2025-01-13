import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		
		
        Thread.sleep(3000);
		
		
		WebElement username1 = driver.findElement(By.id("inputUsername"));
		username1.sendKeys("Shobha");
		
		WebElement password1 = driver.findElement(By.name("inputPassword"));
		password1.sendKeys(password);
		
		WebElement check_box = driver.findElement(By.xpath("//input[@id='chkboxOne']"));
		check_box.click();
		
		WebElement agree_condition = driver.findElement(By.xpath("//input[@id='chkboxTwo']"));
		agree_condition.click();
		
		WebElement signup1 = driver.findElement(By.className("signInBtn"));
		signup1.click();
		
		Thread.sleep(3000);
		
		//if there is only tagname and no attribute , then use xpath with syntax this : "//p[contains(text(),'You are successfully logged in.')]"
		
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]"));
		System.out.println(text.getText());
		Assert.assertEquals(text.getText(), "You are successfully logged in.");
		
		WebElement text_top = driver.findElement(By.tagName("h2"));
		text_top.getText();
		System.out.println(text_top.getText());
		Assert.assertEquals(text_top.getText(), "Hello Shobha,");
		
		WebElement log_out =driver.findElement(By.xpath("//*[text()='Log Out']"));
		log_out.click();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();

}

  public static String getPassword(WebDriver driver) throws InterruptedException
  {
	  driver.get("https://rahulshettyacademy.com/locatorspractice");
	  driver.manage().window().maximize();
	  
	  WebElement forgot_pass = driver.findElement(By.linkText("Forgot your password?"));
	  forgot_pass.click();
	  
	  Thread.sleep(3000);
	  
	  WebElement reset_login = driver.findElement(By.xpath("//button[@class='reset-pwd-btn']"));
	  reset_login.click();
		
	  Thread.sleep(3000);
	  
	  WebElement error_message = driver.findElement(By.xpath("//p[@class='infoMsg']"));
	  //Please use temporary password 'rahulshettyacademy' to Login.
	  System.out.println(error_message.getText());
	  
	  String error_text = error_message.getText();
	  String[] errorArray = error_text.split("'");  // Please use temporary password get spilitted from text rahulshettyacademy' to Login.
	  //String[] errorArray2 = errorArray[1].split("'");
	  String password= errorArray[1].split("'")[0];
	  return password;
	  
	  
	  
	  
	  
	  
  }





}
