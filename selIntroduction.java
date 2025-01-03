import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class selIntroduction {
	
	public static void main(String args[])
	{
		
		
		
		//webdriver.chrome.driver --> value path
		//System.setProperty("webdriver.chrome.driver", "/Users/admin/OneDrive/Documents/chromedriver_win32.exe");
		 WebDriver driver = new  ChromeDriver();
		
		//webdriver.gecko.driver
		 //WebDriver driver = new FirefoxDriver();
		 
		 //Microsoft edge driver
		 //WebDriver driver  =  new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
	    System.out.println(driver.getTitle());
	    driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	    driver.getPageSource();
	    System.out.println(driver.getPageSource());
		
	   //driver.close();
	   //driver.quit();
	}

}
