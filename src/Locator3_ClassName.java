import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator3_ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Using "Class Name" locator in facebook to identify email address
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mounica yalamanchili/Desktop/eclipse - selenium files/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("Mounica");
	    
	}

}
