package Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBuyShare {
	WebDriver driver;
	
	@BeforeClass
	public void SetProperties() throws IOException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		 
		  driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		 
		 driver.get("https://kite.zerodha.com/");
		 
			 
		 driver.manage().window().maximize();
		 
 LoginPage login = new LoginPage(driver);
		 
 
 login.GetData();
 
//		 login.Username();
		 
	//	 login.Password();
		 
		// login.LoginButton();
		 
	//	 LoginPage loginpin = new LoginPage(driver);
		 //https://kite.zerodha.com/
	//	 loginpin.LoginPin();
	//	 loginpin.ContinueButtonForLoginPin();
		 		
	//	}
		
	
//	@BeforeMethod
//	public void SearchShare() throws InterruptedException {
		
 //        HomePage homepage = new HomePage(driver);
		 
	//	 homepage.InvestementValueRadioButton(); //working 
        
		 
	//	 homepage.InputSearchShareAndSelectForBuy();  //working
		 
		
		 
//	}
	
//	@Test
	
//	public void BuyShare() throws Exception {
//	 BuyShare BuyShareWindow = new BuyShare(driver);
	 

	// BuyShareWindow.OptionToGoForSellWindow(); // Exception -- org.openqa.selenium.ElementClickInterceptedException
	 
	//BuyShareWindow.BuyRadioButtonForBSE(); //Element is not clickable  at point () //org.openqa.selenium.ElementClickInterceptedException
	
	// BuyShareWindow.BuyRadioButtonForNSE(); // Exception -- org.openqa.selenium.ElementClickInterceptedException
	 
	// BuyShareWindow.BuyRadioButtonForLongTerm(); // Exception -- org.openqa.selenium.ElementClickInterceptedException
	 
	// BuyShareWindow.BuyRadioButtonForIntraday(); //// Exception -- org.openqa.selenium.ElementClickInterceptedException
	 
	// BuyShareWindow.BuyRadioButoonForMarketPriceOrder(); //working
	 
		// BuyShareWindow.BuyRadioButoonForMarketPriceOrder();
	 
		// BuyShareWindow.BuyRadioButoonForLimitPriceOrder();
		 
	 
		 
		// BuyShareWindow.BuyRadioButoonForStopLossPriceOrder();
		 
	//	 BuyShareWindow.BuyRadioButoonForStopLossLimitPriceOrder();
		 
	//	 BuyShareWindow.BuyClickOnAnchorLinkOfMoreOption();
		 
	// BuyShareWindow.BuyMarginRequiredValueToBuyShare(); working 
	 
	//	 BuyShareWindow.BuyShareButton(); // working
	 
	// BuyShareWindow.BuyCancelShareButton(); //working
	 
	// BuyShareWindow.ClickOnHoldings();
	 
	 
	 
	// BuyShareWindow.ClickOnApps(); //working
	 
	// BuyShareWindow.ClickOnOrders();  //working
	 
	// BuyShareWindow.ClickOnPositons();  //working
	 
	 
	// BuyShareWindow.SelectThePositionsTable();
	 
	// BuyShareWindow.ClickOnFunds();  //working
	 
//	 BuyShareWindow.SelectForStockTypeyouWant(); //working
	 
	 
	// BuyShareWindow.SelectTheHoldingsTable(); //working
	 
	// BuyShareWindow.SelectTheHoldingsProfitValue(); //working
	 
	// BuyShareWindow.BuyClickOnAnchorLinkOfMoreOption(); //working
	 
	//}
		 
		 
		 
	
	
	
}
}
