package fi.seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\saura\\3D Objects\\C-DAC -2021\\Module -8- Software Development\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

	 // driver.get("https://en.wikipedia.org/wiki/Selenium");
	}
	
	public void navigate() throws InterruptedException
	{
		driver.navigate().to("https://en.wikipedia.org/wiki/Selenium");
		System.out.println("This is the title of the website"+driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.id("pt-createaccount")).click();
		Thread.sleep(2000);
		System.out.println("URL:- " +driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		System.out.println("URL:- " +driver.getCurrentUrl());
		
	}

	
	public static void main(String[] args) throws InterruptedException 
	{
		App ob = new App();
		ob.launchBrowser();
	
		ob.navigate();
	  
	}
}
