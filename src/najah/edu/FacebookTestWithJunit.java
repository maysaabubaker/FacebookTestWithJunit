package najah.edu;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTestWithJunit {
	static WebDriver driver;

	@Before
	public void setUp() throws Exception {
System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		
		driver=new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("maysaabubaker@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123123123");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
