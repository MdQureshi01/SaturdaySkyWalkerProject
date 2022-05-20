package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Search result validation
	@FindBy(xpath="//span[2][contains(text(),'shoes')]")
	public WebElement txtShoes;
	
	//Brand Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	//Brand Addidas
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	//Brand Unbranded
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	//Validate Nike
	@FindBy(xpath="//div[contains(text(),'Nike')]")
	public WebElement txtNike;
	
	//Validate Addidas
	@FindBy(xpath="//div[contains(text(),'adidas')]")
	public WebElement txtAdidas;
	
	//Validate Unbranded
	@FindBy(xpath="//div[contains(text(),'Unbranded')]")
	public WebElement txtUnbranded;
	
	//Conditions type
	@FindBy(xpath="//input[@aria-label= 'New']")
	public WebElement cbxconditionsNew;
	
	//color White
	@FindBy(xpath="//input[@aria-label='White']")
	public WebElement cbxColorWhite;
			
	//Conditions Unique
	@FindBy(xpath="//input[@aria-label='Unique']")
	public WebElement cbxConditionsUnique;
	
	
	//Validate Unique
		@FindBy(xpath="//div[contains(text(),'Unique')]")
		public WebElement cbxUnique;
		
	//Validate color White
	@FindBy(xpath="//div[contains(text(),'White')]")
	public WebElement txtColorWhite;
	
	//Validate conditions new
	@FindBy(xpath="//div[contains(text(),'New')]")
	public WebElement txtConditionsNew;
	
	@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee')]")
	public WebElement linkShirtItems;
	
	
	
	
	
	
		
	
	
	
}
