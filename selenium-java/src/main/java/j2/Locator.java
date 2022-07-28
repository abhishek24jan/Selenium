package j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=BWRHYmcn1nrS9dtTlO7dg6Kgfac1kHwckLrQdCYRXjvl1OFFYDS6D3ID2CzIFi3BlLFxVQVLXZnY7dLEKX1EHw");
		driver.findElement(By.id("email")).sendKeys("Abhishek");
		driver.findElement(By.name("password")).sendKeys("rock");
		driver.findElement(By.name("commit")).click();

	}

}
