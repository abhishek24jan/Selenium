package java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java1 {
	public static void main(String[] args) { 

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://hmsv2.lexiconcpl.com/Main/login");
	driver.findElement(By.id("name")).sendKeys("Abhishek");
	
}
}
