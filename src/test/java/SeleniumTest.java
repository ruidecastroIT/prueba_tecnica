/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Rui
 */

public class SeleniumTest {
    
    public SeleniumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    private WebDriver driver;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Versus-PC\\Documents\\NetBeansProjects\\prueba_tecnica_rui_de_castro\\src\\test\\java\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;
        driver.get("https://www.edureka.co");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Versus-PC\\Documents\\NetBeansProjects\\prueba_tecnica_rui_de_castro\\src\\test\\java\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        // And now use this to visit NetBeans
        //driver.manage().window().setSize(new Dimension(1920, 1040));
        driver.getTitle().contains("edureka");
        // Alternatively the same thing can be done like this
        //driver.navigate().to("https://www.edureka.co");
        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
        driver.findElement(By.xpath("//span[contains(@class,'login_click login-vd')]")).click();
        driver.findElement(By.xpath("(//input[@name='data[User][email]'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@name='data[User][password]'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@name='data[User][email]'])[2]")).sendKeys("ruidecastro.it@gmail.com");
        driver.findElement(By.xpath("(//input[@name='data[User][password]'])[2]")).sendKeys("Rn12345678");
        driver.findElement(By.xpath("//button[text()='Login']"));
        driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']")).click();
        driver.findElement(By.xpath("(//a[@class='giTrackElementHeader'])[2]")).click();
        driver.findElement(By.xpath("(//i[@class='icon-pr-edit'])[2]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Full Name*']")).clear();
        driver.findElement(By.xpath("//span[text()='Experience * ']")).clear();
        driver.findElement(By.xpath("//span[text()='Industry* ']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Designation*']")).clear();
        driver.findElement(By.xpath("//span[text()='Select ']")).clear();
        driver.findElement(By.xpath("(//span[text()='Select '])[2]")).clear();
        driver.findElement(By.xpath("(//span[text()='Select '])[3]")).clear();
        driver.findElement(By.xpath("(//span[text()='Select '])[4]")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Full Name*']")).sendKeys("Rui De Castro");
        driver.findElement(By.xpath("//span[text()='Experience * ']")).click();
        driver.findElement(By.xpath("//li[text()[normalize-space()='2-4 years']]")).click();
        driver.findElement(By.xpath("//span[text()='Industry* ']")).click();
        driver.findElement(By.xpath("//li[text()[normalize-space()='IT-Software / Software Services']]"));
        driver.findElement(By.xpath("//input[@placeholder='Designation*']")).sendKeys("QA");
        driver.findElement(By.xpath("//span[text()='Select ']")).clear();
        driver.findElement(By.xpath("//li[text()[normalize-space()='08:00 AM']]")).click();
        driver.findElement(By.xpath("(//span[text()='Select '])[2]")).click();
        driver.findElement(By.xpath("//li[text()[normalize-space()='06:00 PM']]")).click();
        driver.findElement(By.xpath("(//span[text()='Select '])[3]")).click();
        driver.findElement(By.xpath("//li[text()[normalize-space()='09:00 AM']]")).click();
        driver.findElement(By.xpath("(//span[text()='Select '])[4]")).click();
        driver.findElement(By.xpath("//li[text()[normalize-space()='05:00 PM']]")).click();
        driver.findElement(By.xpath("//button[text()='Save and Continue']")).click();
        driver.findElement(By.xpath("//body[@id='footauto']/app-root[1]/app-profile-main[1]/app-header[1]/header[1]/nav[1]/div[1]/div[3]/ul[1]/li[6]/div[1]/ul[1]/li[9]/a[1]")).click();

        driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
