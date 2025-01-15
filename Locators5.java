import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators5 {
	
	public static void main(String args[])
	{
		
		WebDriver driver = new ChromeDriver();
		
		//sibling-parent traverse
		//header/div/button[1]/parent::div/button[2]   - relative path
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]"));  //child to parent traverse
		login.click();
		login.getText();
		System.out.println(login.getText());
		
		
		
		
		//driver.quit();
		
	
		
		
		
		
	}

}
