import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2_UsingID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Using "ID" locator in facebook webPage and identify text field and using "sendkeys" action
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mounica yalamanchili/Desktop/eclipse - selenium files/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("mounicay09@gmail.com");
	    
		
	// using "Name" Locator in facebook to identify password field
		
		driver.findElement(By.name("pass")).sendKeys("Sweety@FaceBook");
		
		// using "xpath" Locator in facebook to identify login button field
		
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		
	}
	

}
