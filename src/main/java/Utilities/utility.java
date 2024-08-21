package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class utility {
	
	
	public static void takeScreenshots(WebDriver driver, String fileName) throws IOException {
		// TODO Auto-generated method stub
		String timeStamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(System.getProperty("user.dir")+"\\Screenshots\\"+fileName+timeStamp+".png"));
	}

}

