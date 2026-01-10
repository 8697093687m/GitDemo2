package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        String page = driver.getCurrentUrl();
        System.out.println(page);
        String page1 = driver.getTitle();
        System.out.println(page1);
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        driver.navigate().to("http://google.com");
        driver.quit();
        
	}

}
