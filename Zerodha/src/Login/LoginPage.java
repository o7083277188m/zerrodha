package Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.util.Strings;


public class LoginPage {

	WebDriver driver;
	 ////input[@placeholder='User ID']
	 
	//input[@placeholder='Password']
	 
	 ////button[@type='submit']
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement username;
	
	@FindBy(xpath="	//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SubmitButton;
	
	
	
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement LoginPin;
	
	
	@FindBy(xpath="//button[@type=\"submit\"]")
    private WebElement Continue; 
    
	
	
	
	
	 LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Username() {
		
	
	}
	
	
	
	public void Password() {
		
		
	}
	
	
	public void LoginButton() {
		
		
	}

	
  
	public void LoginPin()
	{
	
	}
	
	public void ContinueButtonForLoginPin() {
		
	
		
		
	}
	

public void GetData() throws IOException {
	
	File src = new File("C:\\Users\\Shree\\Desktop\\ZerodhaLoginInfo.xlsx");
	
	FileInputStream fis = new FileInputStream(src); // accept the file and converted to byte  
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);  //  total excel is loaed that is in xssfworkbook //if file is .xlx that time use hssfworkbook
	

	
      XSSFSheet sheet1 =wb.getSheetAt(0);  // it will select the sheet 
	
     String Username=sheet1.getRow(1).getCell(0).getStringCellValue(); //
     
    
     username.sendKeys(Username);
 	
    
     
     
     String Password=sheet1.getRow(1).getCell(1).getStringCellValue();
     
     password.sendKeys(Password);
     
     System.out.println(Password);
     
     SubmitButton.click();
     
    int Pin=(int) sheet1.getRow(1).getCell(2).getNumericCellValue();
     
    String s=String.valueOf(Pin);
     
     
     
		LoginPin.sendKeys(s);
		
		
		Continue.click();
      
      System.out.println("Data From Excel Is" +Username+Password+Pin);
      
		int rowcount  = sheet1.getLastRowNum();
      
       System.out.println("the count of row is" +rowcount);
      
       
       
       
       
       
       
      
       for(int i=0 ; i<rowcount+1; i++)
       {
    	   
    	  String username = sheet1.getRow(i).getCell(0).getStringCellValue();
    	  
    	  
    	  String passowrd = sheet1.getRow(i).getCell(1).getStringCellValue();
    	  
    	  
    	  int pin=(int) sheet1.getRow(1).getCell(2).getNumericCellValue();
    	  
    	
    	     
    	  
    	  
    	  
    	// int data8 = (int) sheet1.getRow(i).getCell(1).getNumericCellValue();
    	  
       //   String data2= sheet1.getRow(i).getCell(1).getStringCellValue();   	  
    	  
    	  System.out.println(username+  "         "  +    "         "  +passowrd + "     "  + "     " +pin);
    	   
       }
         
       
      wb.close();
}
	
	
	
}
