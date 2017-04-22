import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver1 {

	public static void main(String[] args) {
	 
		// Using Chrome Browser by ChromeDriver
		
		// below statement should be first statement..otherwise it will throws an error
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\mounica yalamanchili\\Desktop\\eclipse - selenium files\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("Http://google.com");
	}

}


