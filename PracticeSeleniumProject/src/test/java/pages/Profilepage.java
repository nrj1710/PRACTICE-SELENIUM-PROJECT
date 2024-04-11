package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import projectBase.Base;
import projectBase.Common;

public class Profilepage extends Common{
	private By Profilepage =By.xpath("//div[text()='This Profile is for']"); 
	
	public boolean validateProfilePageisDisplayed() {
		return isdisplayed(Profilepage);
	}

}
