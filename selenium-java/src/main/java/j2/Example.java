package j2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("abhishekpoddar387@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.name("commit")).click();
		//.sendKeys(Keys.ENTER);


	driver.findElement(By.xpath(" /html/body/div/header/div[2]/div/div/div[1]/ul/li/text()")).getText();
	}

}
