package SampleTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
driver=new ChromeDriver();
FileInputStream fi = null;
try {
	fi=new FileInputStream("C:\\Users\\ibraheem\\eclipse-workspace\\ExpProject\\src\\SampleTesting\\gmail object repo.properties");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Properties prop =new Properties();
try {
	prop.load(fi);
} catch (IOException e) {
	
	e.printStackTrace();
}
driver.get(prop.getProperty("URL"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath(prop.getProperty("usernamexpath"))).sendKeys(prop.getProperty("username"));
driver.findElement(By.xpath(prop.getProperty("Nextbtn1"))).click();
driver.findElement(By.xpath(prop.getProperty("passwordxpath"))).sendKeys(prop.getProperty("password"));
driver.findElement(By.xpath(prop.getProperty("Nextbtn2"))).click();
String inboxdata=driver.findElement(By.xpath(prop.getProperty("inbox"))).getText();
System.out.println(inboxdata);
WebElement search=driver.findElement(By.xpath(prop.getProperty("searchbox")));
search.sendKeys("is:unread");
search.sendKeys(Keys.ENTER);
String count=driver.findElement(By.xpath(prop.getProperty("unreadcount"))).getText();
System.out.println("unread msg:"+count);
search.clear();
search.sendKeys("is:sent"+Keys.ENTER);
String sentcount=driver.findElement(By.xpath(prop.getProperty("sentcountxpath"))).getText();
System.out.println("sent msgs="+sentcount);



	}

}
