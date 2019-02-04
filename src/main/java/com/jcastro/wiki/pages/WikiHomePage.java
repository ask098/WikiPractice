package com.jcastro.wiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WikiHomePage extends BasePage{

	public WikiHomePage(WebDriver driver/*, String url*/) {
		super(driver);
		driver.get("http://wikipedia.org"/*url*/);
	}

	@FindBy(id="searchInput")
	private WebElement searchInput;

	@FindBy(xpath="//*[@id='search-form']/fieldset/button")
	private WebElement searchButton;



	public ArticlePage buscar(String busqueda) {
		searchInput.sendKeys(busqueda);
		getWait().until(ExpectedConditions.elementToBeClickable(searchButton));  //added
		searchButton.click();
		return new ArticlePage(getDriver());
	}
}
