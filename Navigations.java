import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver(); //invoke chrome browser
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
		
		
		
	}

}
