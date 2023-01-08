//Ayat Fawares

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
public class petClinic {
	WebDriver driver;
	
	

	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fawar\\Desktop\\selenuim\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		this.driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      
		driver.manage().window().maximize();
		

		driver.get("https://petclincqpros.herokuapp.com");

		
	        
	}
	@Test(priority=1)
	public void CheckImage(){

		WebElement img = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/img"));    
        
        System.out.println(img.isDisplayed());
        
     }
	@Test(priority=2)
	public void  Veterinarians() {
		   
	
    	List < WebElement > rows_table = driver.findElements(By.tagName("tr"));
    
    	
    	String ColFirst="//*[@id=\"vets\"]/tbody/tr[";
    	String ColEnd="3]/td";
    	String column;
    	List<WebElement> table_Col;
    	for (int i=1;i<rows_table.size();i++){
    		column=ColFirst+i+ColEnd;
    		table_Col=driver.findElements(By.xpath(column));
    	
    		for(int j=1;j<table_Col.size();j++) {
    			System.out.print(table_Col.get(j).getText()+"            ");
    		}
    		System.out.println();
    	}
	}
	//*[@id="owners"]/tbody/tr[1]
	@Test(priority=3)
	public void OWNERS(){
List < WebElement > rows_table = driver.findElements(By.tagName("tr"));
    
    	String ColFirst="//*[@id=\"owners\"]/tbody/tr[";
    	String ColEnd="]/td";
    	String column;
    	List<WebElement> table_Col;
    	for (int i=1;i<rows_table.size();i++){
    		column=ColFirst+i+ColEnd;
    		table_Col=driver.findElements(By.xpath(column));
    	
    		for(int j=1;j<table_Col.size();j++) {
    			System.out.print(table_Col.get(j).getText()+"            ");
    		}
    		System.out.println();
    	}
	}
	

	
	@Test(priority=4)
	public void ADDOWNER() {
		driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("body > div > div > a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ayat");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Fawares");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Jordan");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Amman");
		driver.findElement(By.xpath("//*[@id=\"telephone\"]")).sendKeys("0795876607");
		
		driver.findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button")).click();
	}
	@Test(priority=5)
	public void ADDPET() {
		
		driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[2]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Fawares");
		
		driver.findElement(By.cssSelector("#search-owner-form > div:nth-child(2) > div > button")).click();
		driver.findElement(By.cssSelector("#owners > tbody > tr:nth-child(2) > td:nth-child(1) > a")).click();
		driver.findElement(By.cssSelector("body > div > div > a:nth-child(4)")).click();
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Parrot");
		driver.findElement(By.xpath("//*[@id=\"birthDate\"]")).sendKeys("2022-04-20");
		driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"type\"]/option[1]")).click();
		
		driver.findElement(By.cssSelector("body > div > div > form > div:nth-child(3) > div > button")).click();
		
	
	
		
	
	}
	@Test(priority=6)
	public void CHECK_Information_added() {
		driver.findElement(By.cssSelector("#main-navbar > ul > li:nth-child(2) > a")).click();
	driver.findElement(By.cssSelector("#search-owner-form > div:nth-child(2) > div > button")).click();
	
		List<WebElement> TRCollection = driver.findElement(By.cssSelector("#owners")).findElements(By.cssSelector("tr"));

		for (WebElement tr : TRCollection) 
		{
		   List<WebElement> TDCollection = tr.findElements(By.tagName("td"));
		   for (WebElement td: TDCollection) 
		   {
		      System.out.println(td.getText());
		   }
		}
		
		
		
		
		
	}
	@AfterMethod
	public void quite() {
		  driver.close();
	}
	
	public static void main(String[] args) 
	
	{
	
	}}
		// TODO Auto-generated method stub


	


