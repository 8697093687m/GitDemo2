package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
        driver.manage().window().maximize();
        //xpath expression using starts-with
        driver.findElement(By.xpath("//input[starts-with(@id,'UserFirstName')]")).sendKeys("Abhimanyu");
        //xpath expression using contains functions
        driver.findElement(By.xpath("//input[contains(@id ,'UserLastName')]")).sendKeys("Testing");
        driver.close();
        ChromeDriver driver54 = new ChromeDriver();
        driver54.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver54.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver54.manage().window().maximize();
        //xpath expression containing text
        driver54.findElement(By.xpath("//a[text()= 'Free Access to InterviewQues/ResumeAssistance/Material']")).click();
        
	}

}
