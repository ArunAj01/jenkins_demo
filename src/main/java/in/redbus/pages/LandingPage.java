package in.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	
	
	@FindBy(id="src")
	private WebElement fromvalue;
	
	@FindBy(id="dest")
	private WebElement tovalue;
	
	@FindBy(xpath="//text[contains(@class,'dateText')]")
	private WebElement date;
	
	@FindBy(xpath="//div[contains(@id,'onwardCal')]")
	private WebElement clickDate;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectFromLocation() {
		fromvalue.sendKeys("Mumbai");
	}
	
	public void selectToLocation() {
		tovalue.sendKeys("Pune");
	}
	
	public void ClickDate() {
		clickDate.click();
	}
	public void selectDate() {
		date.sendKeys("28 Jul");
	}
}
