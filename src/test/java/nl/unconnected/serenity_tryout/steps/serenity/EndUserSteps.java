package nl.unconnected.serenity_tryout.steps.serenity;

import nl.unconnected.serenity_tryout.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    
    @Step
    public void change_language(){
    	dictionaryPage.changeLanguageToGerman();
    }
    
    @Step
    public void is_page_in_german(){
    	assertTrue(dictionaryPage.isPageInGerman());
    }
    
    @Step
    public void change_language_limburgs(){
    	dictionaryPage.changeLanguageToLimburgs();
    }
    
    @Step
    public void is_page_in_limburgs() {
    	assertTrue(dictionaryPage.isPageInLimburgs());
    }
    
}