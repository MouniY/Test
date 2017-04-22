import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using InternetExplorer browser by IntenetExplorerDriver 
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\mounica yalamanchili\\Desktop\\eclipse - selenium files\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
				
	}

}