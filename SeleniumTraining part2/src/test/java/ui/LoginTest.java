package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(72000));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //login using username and password
        driver.findElement(By.xpath("(//input[@class = \"input_error form_input\"])[1]")).sendKeys("standard_users");
        driver.findElement(By.xpath("(//input[@class = \"input_error form_input\"])[2]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id = \"login-button\"]")).click();
        Thread.sleep(10);
        driver.close();
	}
}
