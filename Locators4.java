import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		//sibling-parent traverse
		//header/div/button[1]/following-sibling::button[1]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")); //parent to child traverse
		login.click();
		login.getText();
		System.out.println(login.getText());
		
		
		
		
		//driver.quit();
		
	
		
		
		
		
	}

}
