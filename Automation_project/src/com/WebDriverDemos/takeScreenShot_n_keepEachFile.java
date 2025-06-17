package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class takeScreenShot_n_keepEachFile extends BaseFunction {

	public static void main(String[] args) throws IOException {
		
		Date d = new Date();
		String filename = d.toString().replace(":","_").replace(" ","_");
		System.out.println(filename);
        
		File SSfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(SSfile, new File(filename+"jpeg"));
		File file = new File(filename);
		file.exists();
	}

}
