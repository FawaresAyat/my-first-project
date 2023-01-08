import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop_down_list {
@Test
public void title() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fawar\\Desktop\\selenuim\\WEB DRIVER\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bashamalls.com//Backend/Organizations/SelfRegister");
		driver.findElement(By.xpath("//*[@id=\"Country\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"Country\"]/div/div[1]/div/ul/li/a/span[1]")).click();
		
	}

}
