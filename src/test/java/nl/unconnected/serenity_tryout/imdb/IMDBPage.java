package nl.unconnected.serenity_tryout.imdb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.imdb.com")
public class IMDBPage extends PageObject{

    @FindBy(id="navbar-query")
    private WebElementFacade searchTerms;

    @FindBy(id="navbar-submit-button")
    private WebElementFacade lookupButton;
    
    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
        WebElementFacade suggestion = this.find(By.xpath(
        		"//SPAN[@class='title'][text()='" + keyword + "']"));
        suggestion.click();

    }

    public void lookup_terms() {
        lookupButton.click();
    }
    
    public void sort_by_rating(){
//    	WebElementFacade sort_by = find(By.id("filmoform"));
//    	sort_by.click();
        Select dropdown = new Select(this.find(By.name("sort")));
        dropdown.selectByIndex(3);
    }
    
    public void only_movies(){
		Checkbox cb = new Checkbox(this.find(By.name("movie")));
		cb.check();
    }
		
}
