package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyShare {
	
WebDriver driver;



	
	
	@FindBy(xpath="//div[@class='exchange-selector']//div[@class='exchange su-radio-wrap']/input")
	private WebElement ClickOnSwitchToSellWindow;
	
	@FindBy(xpath="//div[@class='exchange-selector']//div[@class='exchange su-radio-wrap']/input")
	private WebElement RadioButtonForBSE;
	
	@FindBy(xpath="//div[@class='exchange-selector']//div[@class='exchange su-radio-wrap checked']/input")
	private WebElement RadioButtonForNSE;
	
	@FindBy(xpath="//section[@class='wrap']//div[@class='product row']//div[@class='su-radio-group']//div[2]")
	private WebElement RadioButtonForLongTerm;
	
	@FindBy(xpath="//section[@class='wrap']//div[@class='product row']//div[@class='su-radio-group']//div[1]/input")
	private WebElement RadioButtonForIntraday;
	
	
	@FindBy(xpath="//input[@type='number' or @min='1']")
	private WebElement BuyShareQuantityInputFieldElement;
	
//"//section[@class='wrap']//div[@class='body']//div[@class='fields']//div[@class='row'][2]//div[@class='four columns price']//div[@class='su-radio-wrap']//input[@value='MARKET'  and @class='su-radio']"	
	@FindBy(xpath="//label [contains(text(),'Market')]")
	private WebElement BuyRadioButoonForMarketPriceOrderElement;
	
	@FindBy(xpath="//section[@class='wrap']//div[@class='body']//div[@class='fields']//div[@class='row'][2]//div[@class='four columns price']//div[@class='su-radio-wrap checked']/input")
	private WebElement BuyRadioButoonForLimitPriceOrderElement;
	
	
	
	@FindBy(xpath="//section[@class='wrap']//div[@class='body']//div[@class='fields']//div[@class='row'][2]//div[@class='four columns trigger']//div[1]/div/input[@value='SL']")
	private WebElement BuyRadioButoonForStopLossPriceOrderElement;
	
	
	@FindBy(xpath="//section[@class='wrap']//div[@class='body']//div[@class='fields']//div[@class='row'][2]//div[@class='four columns trigger']//div[2]/input[@value='SL-M']")
	private WebElement BuyRadioButoonForStopLossLimitPriceOrderElement;
	
	
	
	
	
	@FindBy(xpath="//a[@href='#'][1]")
	private WebElement ClickOnAnchorLinkOfMoreOption;
	

	@FindBy(xpath="//input[@label='Stoploss']")
	private WebElement ClickOnBuySharButton;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ClickForStoploss;
	
	
	@FindBy(xpath="//div[@class='su-input-group disabled'][1]/input[1]")
	private WebElement InputFieldForStoplossInput;
	
	@FindBy(xpath="//input[@label=\"Target\"]")
	private WebElement ClickForTarget;
	
	@FindBy(xpath="//div[@class='su-input-group disabled'][1]/input[2]")
	private WebElement InputFieldForTargetInput;
	
	@FindBy(xpath="//footer[@class=\"footer\"]//div[@class=\"six columns\"]//span[@class=\"margin-value\"]")
	private WebElement BuyMarginRequiredValue;
	
	
	@FindBy(xpath="//button[@class='button-outline cancel']")
	private WebElement ClickOnCancelButton;
	
	@FindBy(xpath="//a[@href=\"/holdings\"]")
	private WebElement ClickOnHoldingslink;
	
	@FindBy(xpath="//a[@href=\"/orders\"]")
	private WebElement ClickOnOrderslink;
	
	@FindBy(xpath="//a[@href=\"/positions\"]")
	private WebElement ClickOnPositionslink; 
	
	@FindBy(xpath="//a[@href=\"/funds\"]")
	private WebElement ClickOnFundslink;
	 
	@FindBy(xpath="//a[@href=\"/apps\"]")
	private WebElement ClickOnAppslink;
	
	 
	@FindBy(xpath="//select[@placeholder=\"All stocks\"]")
	private WebElement SelectForStockType;
	
	
	@FindBy(xpath="//div[@class=\"holdings\"]//table")
	private WebElement SelectTheHoldingsTableValue;
	
	
	
	@FindBy(xpath="//h1[@class=\"value text-green\"]")
	private WebElement SelectTheHoldingsProfitValueValue;
	
	//
	
	
	@FindBy(xpath="//div[@class=\"data-table fold-header\"][1]//table[1]")
	private WebElement SelectThePositionsProfitValueValue;
	
	
	BuyShare(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
public void OptionToGoForSellWindow() {
		
	
	
	ClickOnSwitchToSellWindow.click();
	
	}
	

	
	public void BuyRadioButtonForBSE() throws InterruptedException {
		
		
			//	act.moveToElement(RadioButtonForIntraday).click().build().perform();
		WebDriverWait  wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOf(RadioButtonForBSE));
		
	   Boolean RadioButtonForBSEResultOfEnable =RadioButtonForBSE.isSelected();
		
	   System.out.println("Status"+RadioButtonForBSEResultOfEnable);
				
			//	RadioButtonForBSE.click();
		
	
	}
	
	
public void BuyRadioButtonForNSE() throws InterruptedException {
	
	Thread.sleep(9000);
	
	RadioButtonForNSE.click();
	
	//WebDriverWait wait=new WebDriverWait(driver, 20);
	
	//boolean selenum = wait.until(ExpectedConditions.invisibilityOf(RadioButtonForNSE));
	
	//System.out.println(selenum);
	
//String string =	RadioButtonForNSE.getText();


//System.out.println(string);
	
	}
	
	
	
	public void BuyRadioButtonForLongTerm() {
		
		
		RadioButtonForLongTerm.click();
		
	boolean isselectedBuyRadioButtonForLongTerm = RadioButtonForLongTerm.isSelected();
	
	System.out.println(isselectedBuyRadioButtonForLongTerm);
		
	}
	
	public void BuyRadioButtonForIntraday() {
		
	//	act.moveToElement(RadioButtonForIntraday).click().build().perform();
		RadioButtonForIntraday.click();
		
		boolean isselectedIntradayRadioButton = RadioButtonForIntraday.isSelected();
		
		System.out.println(isselectedIntradayRadioButton);
		
	}
	
	
	public void BuyShareQuantityInputField()
	{
		BuyShareQuantityInputFieldElement.sendKeys("5");
	}
	
    public void BuyRadioButoonForMarketPriceOrder() throws InterruptedException {
    
   Thread.sleep(5000);
    	
    BuyRadioButoonForMarketPriceOrderElement.click();
    
    }
    
    public void BuyRadioButoonForLimitPriceOrder() throws InterruptedException {
        
    	   Thread.sleep(5000);
    	    	
    	    BuyRadioButoonForLimitPriceOrderElement.click();
    	    
    	    }
    
    public void BuyRadioButoonForStopLossPriceOrder() {
    	
    	BuyRadioButoonForStopLossPriceOrderElement.click();
    }
    
 public void BuyRadioButoonForStopLossLimitPriceOrder() {
    	
	 BuyRadioButoonForStopLossLimitPriceOrderElement.click();
   
 }
 
 public void BuyStopLossCheckBox() {
 	
	 ClickForStoploss.click();
   
 }
 
 
 public void BuyStopLossInputField() {
	 	
	 InputFieldForStoplossInput.click();
   
 }
 
 
 
 
 public void BuyTargetCheckBox() {
	 	
	 ClickForTarget.click();
   
 }

 public void BuyTargetInputField() {
	 	
	 InputFieldForTargetInput.click();
   
 }
 
 
 public void BuyClickOnAnchorLinkOfMoreOption() {
 	
	 ClickOnAnchorLinkOfMoreOption.click();
   
 }
 
 
public void  BuyMarginRequiredValueToBuyShare() {
	
	
String string = BuyMarginRequiredValue.getText();

System.out.println(string);
}
 
 
 
 public void BuyShareButton() {
	 
	boolean String = ClickOnBuySharButton.isEnabled();
	
	System.out.println("Status"+String);
 }
 
 
 
 public void BuyCancelShareButton() {
	 
	String String = ClickOnCancelButton.getText();
	
	System.out.println("Status"+String);
 
	ClickOnCancelButton.click();
 }
 
 public void ClickOnHoldings() {
	 ClickOnHoldingslink.click();
 }
 
 public void ClickOnPositons() {
	 ClickOnPositionslink.click();
 }
 
 public void ClickOnOrders() {
	 ClickOnOrderslink.click();
 }
 
 public void ClickOnApps() {
	 ClickOnAppslink.click();
 }
 
 public void ClickOnFunds() {
	 ClickOnFundslink.click();
 }
 ///kahhfah
 public void SelectForStockTypeyouWant() {
	Select s =new Select(SelectForStockType);
	
       	  s.selectByIndex(1);
	  
 }
 
 public void SelectTheHoldingsTable() {

	 List<WebElement> row = SelectTheHoldingsTableValue.findElements(By.tagName("tr"));
		int a = row.size();
		System.out.println(a);
	 
	 
		for(int i=0; i< a; i++) {
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			int b = col.size();
			for(int j= 0; j<b; j++) {
				System.out.println(col.get(j).getText());
			}
		}
		
 }
 
 
 public void SelectThePositionsTable() {

	 List<WebElement> row = SelectThePositionsProfitValueValue.findElements(By.tagName("tr"));
		int a = row.size();
		System.out.println(a);
	 
	 
		for(int i=0; i< a; i++) {
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			int b = col.size();
			for(int j= 0; j<b; j++) {
				System.out.println(col.get(j).getText());
			}
		}
		
 }
 
 
 
 
  public void SelectTheHoldingsProfitValue() {
         
	  String Value = SelectTheHoldingsProfitValueValue.getText();
    
	   System.out.println(Value);
 
 }
  
  
  public void GetDataFromExcelSheet() {
	  
	  
	  
  }
 
}


