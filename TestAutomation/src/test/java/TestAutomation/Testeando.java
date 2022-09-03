package TestAutomation;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testeando {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		Actions actions = new Actions(driver);
	}
	
	@Test
	public void TestPage() {
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		
		Actions actions = new Actions(driver);
		
		
		//searchbox.clear();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email_create")).click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("adris111@gmail.com");
		
		driver.findElement(By.name("SubmitCreate")).click();
		
		driver.findElement(By.id("uniform-id_gender2")).click();
		
		driver.findElement(By.id("customer_firstname")).click();
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Adriana");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("customer_lastname")).click();
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("Mosqueira Zapata");
		
		
		driver.findElement(By.id("passwd")).click();
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("12345");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("days")).click();
		WebElement day = driver.findElement(By.id("days"));
		day.sendKeys("5");
		day.sendKeys(Keys.ENTER); 
		

		driver.findElement(By.name("months")).click();
		WebElement months = driver.findElement(By.id("months"));
		months.sendKeys("d");
		months.sendKeys(Keys.ENTER); 
		
		driver.findElement(By.id("years")).click();
		WebElement anio = driver.findElement(By.id("years"));
		anio.sendKeys("2020");
		anio.sendKeys(Keys.ENTER); 
		
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("company")).click();
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Testeando INC");
		
		driver.findElement(By.id("address1")).click();
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("Urb. ABC 123");
		
		driver.findElement(By.id("city")).click();
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Lima");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("id_state")).click();
		WebElement state = driver.findElement(By.id("id_state"));
		state.sendKeys("id");
		state.sendKeys(Keys.ENTER); 
		
		driver.findElement(By.id("postcode")).click();
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("00031");
		
		driver.findElement(By.id("other")).click();
		WebElement other = driver.findElement(By.id("other"));
		other.sendKeys("testeando 123 123");
		
		driver.findElement(By.id("phone_mobile")).click();
		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("935991971");
		
		driver.findElement(By.id("alias")).click();
		WebElement alias = driver.findElement(By.id("alias"));
		alias.clear();
		alias.sendKeys("Adri2222");
		
		driver.findElement(By.id("submitAccount")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();	
		//assertEquals("fiorem1891@gmail.com",driver.getTitle());
	}
	
	//@After
	//public void tearDown( ) {
		//driver.quit();
	//}
				
}
