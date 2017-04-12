package nl.unconnected.serenity_tryout.imdb;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class ImdbDefineSteps {

	@Steps
	IMDBEndUser imdbEnduser;
	
	@Given("the user is on the IMDB homepage")
	public void givenTheUserIsOnTheHomepage(){
		imdbEnduser.open_home_page();
	}
	
    @When("the user looks up the actor '$actor'")
    public void whenTheUserLooksUpActor(String actor) {
        imdbEnduser.look_for(actor);
    }	
	
    @Then("they should see the top rated movies this person played in")
    public void theyShouldSeeTopMovies() {
        imdbEnduser.top_movies();
    }	
    
}
