package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(72000));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        //By id
        //driver.findElement(By.id("name")).sendKeys("Mainak");
        // By name
        //driver.findElement(By.name("enter-name")).sendKeys("Testing");
        // By classname
        //driver.findElement(By.className("inputs")).sendKeys("Abhimanyu");
        // By linktext
        //driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        // By PartialLinkText
        //driver.findElement(By.partialLinkText("Free Access to")).click();
        // By xpath
        //driver.findElement(By.xpath("//input[@name = 'enter-name']")).sendKeys("Automation");
        // By css selector
        //driver.findElement(By.cssSelector("input[name = 'enter-name']")).sendKeys("Testing");

	}

}
