import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1st program
public class A {

	public static void main(String[] args) throws InterruptedException {
		// The below 2 lines invoke the browser
     
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
		
		//The below line navigates to 'Google' web site
		driver.get("https://www.google.ca/");
		
		// The below line gets the title of the current web page and prints it out to console
		System.out.println(driver.getTitle());
		
		// gets the current URL and prints it out to screen
		System.out.println(driver.getCurrentUrl());
		
		//navigates to the Yahoo web page
		driver.get("https://ca.yahoo.com/");
		
		// gets the title of the current web page and prints it out on the screen
		System.out.println(driver.getTitle());
		
		//checks the current URL and prints it out on the screen
		System.out.println(driver.getCurrentUrl());
		
		//The below line makes the web page navigate from "Yahoo" and back to "Google"
		driver.navigate().back();
		
		Thread.sleep(5000);   //Figured after running that it is needed as navigating back to the google webpage is slower than the execution of the last line below
		
		//checks the current URL and prints it out on the screen
	    System.out.println(driver.getCurrentUrl());
	    
	    // Last line is to print out the page source (Manually it is when you right-click and then click on "View Page Source"
	    //System.out.println(driver.getPageSource());
	    
	    Thread.sleep(10000);
	    //closes the last webpage
	    driver.close();   
	     //driver.quit(); //would work too, just fine as it's closes all web pageS that are open
		
		
		
		
		
		
		
	}

}
