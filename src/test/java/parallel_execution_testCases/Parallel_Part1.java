package parallel_execution_testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	// parallel via methods
	// parallel via classes
	// parallel via tests

public class Parallel_Part1 {
	
	public static WebDriver driver;
	
	@Test(priority = 1, threadPoolSize = 3, invocationCount = 5)
	public void logic1() {
		
		System.out.println("This is logic1 operation:  " + Thread.currentThread().getId() );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@Test (priority = 2)
	public void logic2() {
		
		System.out.println("This is logic2 operation: " + Thread.currentThread().getId());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
	}
	@Test (priority = 3)
	public void logic3() {
		
		System.out.println("This is logic3 operation: " + Thread.currentThread().getId());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}

}
