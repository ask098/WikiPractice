package com.jcastro.wiki.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jcastro.wiki.pages.ArticlePage;
import com.jcastro.wiki.pages.WikiHomePage;

public class WikiTest extends BaseTest {


//	@DataProvider(name = "inputData")
//	public static Object[][] inputData() {
//		return new Object[][] {{"Java", "Java"}, {"php", "PHP"}, {"Python", "Python"}};
//	}
//
//	@BeforeMethod(alwaysRun = true)
//	@Parameters({"url"})
//	private void loadPage(String url){
//		myDriver.getDriver().get(url);
//	}

	@Test//(dataProvider = "inputData")
	public void testWikiSearch() {  //String input, String result
		WikiHomePage home = getWikiHomePage();
		ArticlePage articlePage = home.buscar("Java"); //previous imput -java
		Assert.assertEquals(articlePage.getPageTitle(),"Java"); //revoius result -java
	}
//
//	@AfterClass(alwaysRun = true)
//		private void afterClass() {
//		wikiHome.dispose();
//	}

}
