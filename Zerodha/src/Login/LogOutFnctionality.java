package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogOutFnctionality {

	WebDriver driver;
	
	@FindBy(xpath="//div[@class='right-nav']//span")
	private WebElement ClickOnUsername;
	
	////div[@class='dropdown-nav layer-2']//ul//li[10]//a[@href='/logout']
	
	
	@FindBy(xpath="//a[@href='/logout']")
	public WebElement ClickOnLogout;
	
	
	@FindBy(xpath="//div[@class='dropdown-nav layer-2']//ul")
	private WebElement ListOfDropdownlist;
	
	
	
	LogOutFnctionality(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void ClickOnUsername() {
		
		
	}
	
	
	
	
	public void ClickOnLogout() {
		
		ClickOnUsername.click();
		
		ClickOnLogout.click();
		
		
	   
		
	}
	
}
