package parallel_execution_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_Part2 {
	
	public static WebDriver driver;
	
	@Test(priority = 1)
	public void logic4() {
		
		System.out.println("This is logic4 operation: " + Thread.currentThread().getId());
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 2)
	public void logic5() {
		
		System.out.println("This is logic5 operation: " + Thread.currentThread().getId());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
	}
	
	@Test(priority = 3)
	public void logic6() {
		
		System.out.println("This is logic6 operation: " + Thread.currentThread().getId());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}

}
