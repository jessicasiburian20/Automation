package selenium.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomer {
	
	@Test
	public static void main (String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//login
		driver.get("https://dashboard-staging.rekalaba.com/");
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("pinnuspryandi@gmail.com");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("admin123456");
		driver.findElement(By.xpath("//div[@id='login-form']/form/button")).click();

		driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/fuse-nav-vertical-collapse[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-navigation\"]/fuse-nav-vertical-collapse[9]/div/fuse-nav-vertical-item/a")).click();
		driver.findElement(By.xpath("//div[@id='rekalaba-ui-customer-list']/mat-sidenav-container/mat-sidenav-content/div/div/div/div/div[2]/button/span")).click();
		
		//add data customer
		driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("TestRekalaba");
		driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("testrekalaba@gmail.com");
		driver.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("082212345678");
		driver.findElement(By.xpath("//textarea[@id='mat-input-7']")).sendKeys("Jakarta");
		driver.findElement(By.xpath("//input[@id='mat-input-8']")).sendKeys("CompanyTest");
		driver.findElement(By.xpath("//div[@id='cdk-overlay-1']/mat-dialog-container/app-customer-list-form/div/div[2]/div/button")).click();
	}
}
