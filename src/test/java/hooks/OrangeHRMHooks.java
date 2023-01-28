package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class OrangeHRMHooks {

	WebDriver driver;
	 
    @SuppressWarnings("deprecation")
	@Before
    public void setup() {
 
        System.out.println("------------------Before Executing-------------------------");
        //System.setProperty("webdriver.chrome.driver",
                //"C:\\Users\\SingVi04\\Desktop\\SeleniumKT\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
    
    @After
    public void close() {
        driver.close();
        System.out.println("--------------------After Executing-----------------------");
    }
    
}