import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {
	
	@Test
	public void homePageCheck() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		// caps.setPlatform(Platform.);
		// caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
         caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.32:4444"), caps);
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
