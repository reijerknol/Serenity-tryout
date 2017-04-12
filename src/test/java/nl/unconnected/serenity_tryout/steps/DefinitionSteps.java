package nl.unconnected.serenity_tryout.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import nl.unconnected.serenity_tryout.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }
    
    @When("the user changes the language to German")
    public void whenTheUserChangesTheLanguage() {
        endUser.change_language();
    }
    
    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }
    

    @Then("they should see 'Aussprache'")
    public void thenTheyShouldSeeWords() {
        endUser.is_page_in_german();
    }
    
    @When("the user changes the language to Limburgs")
    public void whenTheUserChangesTheLanguagetoLimburgs() {
        endUser.change_language_limburgs();
    }
    
    @Then("they should see 'Ingelsj'")
    public void thenTheyShouldSeeADefinitionContainingTheWordsIngelsj() {
        endUser.is_page_in_limburgs();
    }
}
