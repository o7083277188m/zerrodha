package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;

	@FindBy(xpath="//label[text()='Investment value']")
	private WebElement InvestementValueRadioButton;
	
	////ul[@class='marketwatch-selector list-flat']//li[1]
	
	////div[@class='search-result']//ul
	
  
	@FindBy(xpath="//input[@class='search-input-field']")
	private WebElement SearchInputField;

	@FindBy(xpath="//div[@class='search-result']//ul//li[1]")
	private WebElement SearchInputFieldAfterSendingName;
	
	
	HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void InvestementValueRadioButton() throws InterruptedException 
	   {
			
			
		   boolean BeforeClickinvestementvalueisselected =InvestementValueRadioButton.isSelected();
		   
		   System.out.println("is selected investement value radio button"+BeforeClickinvestementvalueisselected);
		   
		   Thread.sleep(500);
		   InvestementValueRadioButton.click();
		   
		   
           boolean AfterClickinvestementvalueisselected =InvestementValueRadioButton.isSelected();
		   
		   System.out.println("is selected investement value radio button"+AfterClickinvestementvalueisselected);
		   
		}
	
	
	public void InputSearchShareAndSelectForBuy() {
		
		SearchInputField.click();
		
		
		
		
	 SearchInputField.sendKeys("COALINDIA");
	
	
	 SearchInputFieldAfterSendingName.click();
	 
	 
	 //Actions act = new Actions(driver);
	 
	// act.moveToElement((WebElement) s).perform();
		
	}
	
	
}
