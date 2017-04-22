import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator4_LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Using "Link text" locator in FaceBook page
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mounica yalamanchili/Desktop/eclipse - selenium files/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Forgot account?")).click();
	    
		
	}

}
