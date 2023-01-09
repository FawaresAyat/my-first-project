import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver ; 
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(); 

		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();

		String[] myListOfFirstName = { "ahmad", "ali", "marwa", "anas", };

		int randomOne = (int) (Math.random() * myListOfFirstName.length - 1);

		String[] myListOfLastName = { "omar", "mahmoud", "eman", "enas", };

		int randomTwo = (int) (Math.random() * myListOfLastName.length - 1);

		WebElement myInputForTheFirstName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
		myInputForTheFirstName.sendKeys(myListOfFirstName[randomOne]);
	}

}
