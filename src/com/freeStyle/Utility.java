package com.freeStyle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	static WebDriver driver;
public static String takeScreenShot() {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String path=System.getProperty("user.dir")+"/failedScreenShot/"+System.currentTimeMillis()+".png";
	File destination=new File(path);
try {
	FileUtils.copyFile(src, destination);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return path;
}

}
