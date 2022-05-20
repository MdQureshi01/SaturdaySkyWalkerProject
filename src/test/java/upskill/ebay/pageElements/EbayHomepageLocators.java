package upskill.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import upskill.utilities.SetupDrivers;

public class EbayHomepageLocators {
	
	//search text button
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch; 
	
	//text button
	@FindBy(xpath="//input[contains(@value, 'Search_')]")
	public WebElement btnSearch; 
	
	//Locators without page factory.
	public WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[contains(@value, 'Search')]"));

	 //Summary
	@FindBy(xpath="//a[@data-sp='m570.l1533')]")
	public WebElement clickSummary; 
		
    //My Ebay Link
	@FindBy(xpath="//a[@title='My eBay')]")
	public WebElement linkMyEbay; 
	
}
