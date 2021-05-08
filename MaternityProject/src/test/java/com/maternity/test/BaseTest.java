package com.maternity.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.FileInput;

public class BaseTest {

	WebDriver dr;
	Properties pr;


	@BeforeMethod
	public void openBrowser() throws IOException {
     System.out.println("Open Browser");
		FileInput fi = new FileInput();

		pr = fi.readFile();

		String br = pr.getProperty("browser");

		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/Users/saifulalam/Downloads/chromedriver");

			dr = new ChromeDriver();

		} else if (br.equals("firefox")) {

			// System.setProperty("webdriver.gecko.driver",
			// "/Users/saifulalam/Downloads/geckodriver");

			dr = new FirefoxDriver();

		}

		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		dr.get(pr.getProperty("url"));

		dr.switchTo().activeElement().click();

	}

//	@AfterMethod
//	public void closeBrowser() {
//		dr.close();
//	}
//	

}
