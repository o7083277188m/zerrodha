package Login;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassForHomeAndLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		 
		 driver.get("https://kite.zerodha.com/");
		 
		 driver.manage().window().maximize();
		 
		 LoginPage login = new LoginPage(driver);
		 
		 login.Username();
		 
		 login.Password();
		 
		 login.LoginButton();
		 
		// login.Heading();
		 
		 login.LoginPin();
		 
		 login.ContinueButtonForLoginPin();
		 
		
		 
		 HomePage homepage = new HomePage(driver);
		 
		 homepage.InvestementValueRadioButton();
		 
		 homepage.InputSearchShareAndSelectForBuy();
		 
		 
		 BuyShare BuyShareWindow = new BuyShare(driver);
		 
		 BuyShareWindow.BuyShareQuantityInputField();
		 
		// BuyShareWindow.OptionToGoForSellWindow();
		 
		
	
		// BuyShareWindow.BuyRadioButtonForBSE();
		 
		
		 
		// BuyShareWindow.BuyRadioButtonForNSE();
		 
	//	 BuyShareWindow.BuyRadioButtonForLongTerm();
		 
		 
	//	 BuyShareWindow.BuyRadioButtonForIntraday();
		 
		// BuyShareWindow.BuyRadioButoonForMarketPriceOrder();
		 
		// BuyShareWindow.BuyRadioButoonForLimitPriceOrder();
		 
		 
		// BuyShareWindow.BuyRadioButoonForStopLossPriceOrder();
		 
	//	 BuyShareWindow.BuyRadioButoonForStopLossLimitPriceOrder();
		 
	//	 BuyShareWindow.BuyClickOnAnchorLinkOfMoreOption();
		 
		// BuyShareWindow.BuyShareButton();
		 
		// LogOutFnctionality Logout =new LogOutFnctionality(driver);
		 
		// Logout.ClickOnUsername();
		 
     //	 Logout.ClickOnLogout();
     	 
		 
		

	}

}
