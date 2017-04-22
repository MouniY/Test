import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Clicking a button in google.com by using click method
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mounica yalamanchili/Desktop/eclipse - selenium files/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.google.com");
	    driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
	}
	

}
