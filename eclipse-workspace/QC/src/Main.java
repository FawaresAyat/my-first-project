import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fawar\\Desktop\\selenuim\\WEB DRIVER\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.jo/");

		

		//Checking on Page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Show page Source code
		String Source = driver.getPageSource();
		System.out.println(Source);

		// will close the current page that open 
		//driver.close();
		// will close all pages opened by selenium  
		//driver.quit();

		
		driver.navigate().to("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.navigate().back();


		
		
	}

}
