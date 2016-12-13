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
       //  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
    	System.setProperty("webdriver.gecko.driver", "/usr/local/etc/geckodriver");
    	DesiredCapabilities cap = DesiredCapabilities.firefox();
    	cap.setCapability("marionette", true);
    	 driver = new FirefoxDriver(cap);
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
