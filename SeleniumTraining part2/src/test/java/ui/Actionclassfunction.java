package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclassfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		//applying 'Enter' through Action class
		driver.findElement(By.id("user-name")).sendKeys("Mainak");
		driver.findElement(By.id("password")).sendKeys("Chowdhury");
		action.sendKeys(Keys.ENTER).perform();
		//applying select all through action class
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//applying hovering through action class
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Home']"));
		action.moveToElement(ele).perform();
		//applying doubleclick through action class
		WebElement ele1 = driver.findElement(By.id("dropdown-class-example"));
		action.doubleClick(ele1).perform();
		System.out.println("de");
		//applying right click through action class
		WebElement el2 = driver.findElement(By.xpath("//a[text()='Open Tab']"));
		action.contextClick(el2).perform();
		//applying build through action class
		WebElement el3 = driver.findElement(By.xpath("//input[@name='enter-name']"));
		action.moveToElement(el3).click().sendKeys("Mainak").build().perform();
		//drag and drop through action class
		driver.navigate().to("https://jqueryui.com/droppable/");
		WebElement el4 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(el4);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source,target).perform();
		System.out.println("All done");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement etr = driver.findElement(By.xpath("//input[@value='radio1']"));
		js.executeScript("arguments[0].click();",etr);
	}	

}