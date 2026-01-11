package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatecommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Mainak");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mainak123");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement yt = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        action.contextClick(yt).perform();
	}

}
