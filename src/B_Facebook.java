import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		// Locates the username field (& automatically moves cursor into it)
		 driver.findElement(By.id("email")).sendKeys("testAutomation@gmail.com"); 
		//driver.findElement(By.name("email")).sendKeys("testAutomation@gmail.com");
		
		// Locates the password field and moves cursor into it
		driver.findElement(By.id("pass")).sendKeys("857472");
		
		//Located the login button & clicks on it
		//driver.findElement(By.name("login")).click();
		
		// Clicks on the "Forgot password" link
		driver.findElement(By.linkText("Forgot password?")).click(); 
		
		
		Thread.sleep(3000L);
		driver.close();

	}

}
