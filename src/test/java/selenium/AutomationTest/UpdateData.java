package selenium.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateData {
	
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

		driver.findElement(By.xpath("//span[normalize-space()='Customer (CRM)']")).click();
		driver.findElement(By.xpath("//span[@class='nav-link-title'][normalize-space()='Customer List']")).click();
		driver.findElement(By.xpath("//div[@id='rekalaba-ui-customer-list']/mat-sidenav-container/mat-sidenav-content/div/div/div/div/div[2]/button/span")).click();
		
		//update data customer
		driver.findElement(By.xpath("//body//fuse-root//mat-row[2]")).click();
		//update Customer Name
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("Test Edit");
		driver.findElement(By.xpath("email")).clear();
		driver.findElement(By.name("email")).sendKeys("testedit123@gmail.com");
		driver.findElement(By.xpath("phoneNo")).clear();
		driver.findElement(By.name("phoneNo")).sendKeys("081212345678");
		driver.findElement(By.xpath("address")).clear();
		driver.findElement(By.name("address")).sendKeys("Jakarta Barat Daya");
		driver.findElement(By.xpath("companyName")).clear();
		driver.findElement(By.name("companyName")).sendKeys("Jakarta Barat Daya");
		driver.findElement(By.xpath("//button[@aria-label='SAVE']")).click();
	}
}
