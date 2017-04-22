import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	static ChromeDriver driver;
	public static void main(String[] args) {	
		//WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mounica yalamanchili\\Desktop\\eclipse - selenium files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://yssofindia.org");
		driver.manage().window().maximize(); 
		Actions action=new Actions(driver);
		WebElement aboutYss=driver.findElement(By.xpath("//[@id='topmenu']/div/ul/li[5]/a/img"));
		WebElement contactUs=driver.findElement(By.xpath("//[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
		action.moveToElement(aboutYss).moveToElement(contactUs).build().perform();
		WebElement emailUs=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		emailUs.click();
		}
		
}