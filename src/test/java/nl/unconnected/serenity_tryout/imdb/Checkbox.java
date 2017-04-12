package nl.unconnected.serenity_tryout.imdb;

import org.openqa.selenium.WebElement;

public class Checkbox {
	
	private WebElement _checkbox;
	
	public Checkbox(WebElement checkbox){
		_checkbox = checkbox;
	}
	
	
	public WebElement getCheckbox(){
		return _checkbox;
	}
	
	public void check(){
		if (!(_checkbox.isSelected()))
		{
			_checkbox.click();
		}
	}
	
	public void uncheck(){
		if((_checkbox.isSelected()))
		{
			_checkbox.click();
		}
	}
	

}
