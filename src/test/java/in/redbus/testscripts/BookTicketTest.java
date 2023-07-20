package in.redbus.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import in.redbus.pages.LandingPage;

public class BookTicketTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void lauchApp() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//1) Open the browser
		driver=new ChromeDriver(options);
		
		//2) Maximize it
		driver.manage().window().maximize();
		
		//3) Navigate to application
		driver.get("https://redbus.in");
	}
	
	@Test
	public void bookTicket() {
		
		LandingPage landingPage=new LandingPage(driver);
		
		//4) Enter 'From' city - mumbai
		landingPage.selectFromLocation();
		
		//5) Enter 'To' city - Pune
		landingPage.selectToLocation();

		//6) Pick up 28th from Calendar
		landingPage.ClickDate();
		landingPage.selectDate();
		
		
		//7) Click on 'Search Buses' button

		//8) Click on 'View Buses' corresponding to first search result on the next page

		//9) Click 'View Seats' corresponding to first bus

		//10) Select Boarding point and Dropping points

		//11) Click 'View Seats' button

	}
	
	@AfterTest
	public void closeBrowser() {
	//driver.quit();	
	}
	
}
