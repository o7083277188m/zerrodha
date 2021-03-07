package Login;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FInal {
	
	WebDriver driver;
	
	@BeforeClass
	public void SetProperties() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		 
		  driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		 
		 driver.get("https://kite.zerodha.com/");
		 
			 
		 driver.manage().window().maximize();
		 		
		}
	
	@BeforeMethod
	public void LoginAndPassword() {
 LoginPage login = new LoginPage(driver);
		 
		 login.Username();
		 
		 login.Password();
		 
		 login.LoginButton();
		 
	     String currenturllogin = driver.getCurrentUrl();
	     
	    String ExpectedUrllogin = "https://kite.zerodha.com/";
	    
	    Assert.assertEquals(currenturllogin, ExpectedUrllogin);
	    
	 
		
	}
	
	@Test
	public void Pin() {
		 LoginPage loginpin = new LoginPage(driver);
		 //https://kite.zerodha.com/
		 loginpin.LoginPin();
		 loginpin.ContinueButtonForLoginPin();
		 
		 String currenturlloginpin = driver.getCurrentUrl();
		 
		  String ExpectedUrlloginpin = "https://kite.zerodha.com/";
		  
		  Assert.assertEquals(currenturlloginpin, ExpectedUrlloginpin);
		  
		  
		 
		
	}
	
	@AfterMethod
	public void HomePage(){
		
		System.out.println("We Got The Home Page");
	}
	
	
	
	
	

}

