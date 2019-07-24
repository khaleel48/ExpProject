package com.freeStyle;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestData {

	public static void main(String[] args) throws WebDriverException {
		WebDriver driver;
		String winname = null;
		//System.setProperty("webdriver.driver.chromedriver", "");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
driver.findElement(By.linkText("Gmail")).click();
driver.findElement(By.linkText("Sign in")).click();
Set<String> windows=driver.getWindowHandles();
Iterator<String> itr=windows.iterator();
while (itr.hasNext()) {
	winname=itr.next();
	
}
driver.switchTo().window(winname);
driver.findElement(By.id("identifierId")).sendKeys("khaleelqa2015@gmail.com");
driver.findElement(By.className("CwaK9")).click();
driver.findElement(By.name("password")).sendKeys("khaleel@48");


	}

}
