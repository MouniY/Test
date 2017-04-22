import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator5_PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//By using "partialLinkText" locator in facebook 
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mounica yalamanchili/Desktop/eclipse - selenium files/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.partialLinkText("Forgot")).click();
	    
	}

}
