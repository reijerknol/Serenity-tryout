package nl.unconnected.serenity_tryout.imdb;

import net.thucydides.core.annotations.Step;

public class IMDBEndUser {
	
	IMDBPage imdbPage;
	
	@Step
	public void open_home_page(){
		imdbPage.open();
		imdbPage.getDriver().manage().window().maximize();
	}
	
	@Step
	public void look_for(String actor)
	{
		imdbPage.enter_keywords(actor);
	}
	
	@Step
	public void top_movies(){
		imdbPage.sort_by_rating();
		imdbPage.only_movies();
	}
}
