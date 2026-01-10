package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		driver.manage().window().maximize();
		//Frame identification by index
		//driver.switchTo().frame(0);
		//driver.findElement(By.linkText("W3Schools.com")).click();
		//driver.switchTo().parentFrame();
        //String df = driver.getTitle();
        //System.out.println(df);
        //Frame identification by name/id only
        //driver.switchTo().frame("iframeResult");
        //driver.findElement(By.linkText("W3Schools.com")).click();
		//driver.switchTo().parentFrame();
        //String df1 = driver.getTitle();
        //System.out.println(df1);
        //Frame identification by web element
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.linkText("W3Schools.com")).click();
        WebElement frame45 = driver.findElement(By.xpath("//iframe[@title = 'Iframe Example']"));
        driver.switchTo().frame(frame45);
        driver.findElement(By.xpath("(//span[starts-with(@class,'button')])[1]")).click();
        driver.switchTo().parentFrame();
        System.out.println("operation done");
        String df2 = driver.getTitle();
        System.out.println(df2);

	}

}
