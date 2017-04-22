import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/mounica yalamanchili/Desktop/eclipse - selenium files/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		WebElement registerLink = driver.findElement(By.linkText("Register"));
        if(registerLink.isDisplayed()){
        	System.out.println("Link is present. Passed");
        }else{
        	System.out.println("Link is not present. Failed");
        }
       driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
      
	}

}

