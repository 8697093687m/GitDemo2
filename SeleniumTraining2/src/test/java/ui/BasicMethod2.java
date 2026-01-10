package ui;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethod2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.sugarcrm.com/au/");
        String windowhandle = driver.getWindowHandle();
        System.out.println(windowhandle);
        Thread.sleep(3000);
        WebElement link = driver.findElement(By.xpath("//a[text()= 'Watch free demo']"));
        //link.click();
        link.sendKeys(Keys.CONTROL,Keys.ENTER);
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);
	}

}
