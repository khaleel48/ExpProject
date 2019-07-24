package SampleTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		WebDriver driver;
		//Initiate the browser
		driver=new ChromeDriver();
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("C:\\Users\\ibraheem\\eclipse-workspace\\ExpProject\\src\\SampleTesting\\objectrepository1.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				//Url request
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Page title:"+driver.getTitle());
		System.out.println("page url:"+driver.getCurrentUrl());
		WebElement dropdownbox=driver.findElement(By.id(prop.getProperty("dropdownboxid")));
		Select listbox=new Select(dropdownbox);
		List<WebElement> list=listbox.getOptions();
		System.out.println(list.size());
		for (WebElement items : list) {
		System.out.println(items.getText());	
			
		}
		
	}

}
