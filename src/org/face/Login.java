package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\Desktop\\raja\\Facebook\\div\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("123@gmail.com"); 
        
        driver.findElement(By.id("pass")).sendKeys("76538736");
        
        driver.findElement(By.id("lgnbutton")).click();
	}

}
