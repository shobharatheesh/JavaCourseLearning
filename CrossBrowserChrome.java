import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CrossBrowserChrome {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		
		
        Thread.sleep(3000);
		
		
		WebElement username1 = driver.findElement(By.id("inputUsername"));
		username1.sendKeys("Shobha");
		
		WebElement password1 = driver.findElement(By.name("inputPassword"));
		password1.sendKeys("rahulshettyacademy");
		
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
}
