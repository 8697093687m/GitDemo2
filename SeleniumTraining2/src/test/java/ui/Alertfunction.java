package ui;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertfunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        //handling alert by accepting it
        WebElement frame42 = driver.findElement(By.xpath("//iframe[@id = 'iframeResult']"));
        driver.switchTo().frame(frame42);
        driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
        String alertfound = driver.switchTo().alert().getText();
        System.out.println(alertfound);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        String title = driver.getTitle();
        System.out.println(title);
        //handling alert by dismissing it
        WebElement frame43 = driver.findElement(By.xpath("//iframe[@id = 'iframeResult']"));
        driver.switchTo().frame(frame43);
        driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
        String alertfound23 = driver.switchTo().alert().getText();
        System.out.println(alertfound23);
        driver.switchTo().alert().dismiss();
        driver.switchTo().parentFrame();
        String title23 = driver.getTitle();
        System.out.println(title23);
        //handling alert by sending text into it
        driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
        Alert ai = driver.switchTo().alert();
        ai.sendKeys("Mainak Chowdhury");
        Thread.sleep(3000);
        ai.accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
	}

}
