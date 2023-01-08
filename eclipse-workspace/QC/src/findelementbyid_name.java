import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementbyid_name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fawar\\Desktop\\selenuim\\WEB DRIVER\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bashamalls.com//Backend/Organizations/SelfRegister\r\n");
		driver.findElement(By.id("Name")).sendKeys("Store Name");
   		
		driver.findElement(By.name("Description")).sendKeys("Description");
		driver.findElement(By.id("AdminName")).sendKeys("Ayat");
		driver.findElement(By.id("AdminPhoneNumber")).sendKeys("079765");
		

	}

}
