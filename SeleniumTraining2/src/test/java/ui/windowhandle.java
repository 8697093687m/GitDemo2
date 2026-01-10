package ui;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
        driver.manage().window().maximize();
        WebElement newtab = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
        newtab.click();
        Set<String> windowhandle = driver.getWindowHandles();
        System.out.println(windowhandle);
        Iterator<String>iterator = windowhandle.iterator();
        String Parrentwindow = iterator.next();
        String Childwindow = iterator.next();
        driver.switchTo().window(Childwindow);
        driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
        String alert = driver.switchTo().alert().getText();
        System.out.println(alert);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.switchTo().window(Parrentwindow);
        System.out.println(driver.getTitle());
        
	}

}
