/**
 * 
 */
package HelloWorld;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author Elena Oliván
 *
 */
public class RemoteWebDriverTest {
    public static WebDriver driver;

    @BeforeClass
    public static void conectarDriver() throws MalformedURLException {
      System.setProperty("webdriver.gecko.driver", "/usr/local/etc/geckodriver");
    	DesiredCapabilities cap = DesiredCapabilities.firefox();
    	cap.setCapability("marionette", true);
    	cap.setBrowserName("firefox");
    	cap.setVersion("50");
    	cap.setPlatform(Platform.LINUX);
    	// driver = new FirefoxDriver(cap);
    	System.out.println("-----------");
    	System.out.println("NOMBRE BROWSER: "+ cap.getBrowserName());
    	System.out.println("version BROWSER: "+ cap.getVersion());
    	System.out.println("NOMBRE plataforma: "+ cap.getPlatform());
    	System.out.println("-----------");
    	 driver = new RemoteWebDriver(new URL("http://localhost:5559/wd/hub"), cap);
     	
    }

    @Test
    public void elTituloDeGoogleEsGoogle(){
        driver.get("http://www.google.es");
        assertEquals(driver.getTitle(), "Google");
    }

    @AfterClass
    public static void cerrarDriver(){
        driver.close();
    }
}
