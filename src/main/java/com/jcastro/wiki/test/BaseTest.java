package com.jcastro.wiki.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.jcastro.wiki.MyDriver;
import com.jcastro.wiki.pages.WikiHomePage;

public class BaseTest {
	
	MyDriver myDriver;
	
	public WikiHomePage wikiHome;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
		wikiHome = new WikiHomePage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		wikiHome.dispose();
	}
	
	public WikiHomePage getWikiHomePage() {
		return wikiHome;
	}

}