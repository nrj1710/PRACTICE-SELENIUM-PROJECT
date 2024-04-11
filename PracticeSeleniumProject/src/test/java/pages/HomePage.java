package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import projectBase.Base;
import projectBase.Common;

public class HomePage extends Common{
	
	private By lookingFor =By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div[contains(@class, 'is-selected')]");
	private By lookingFor(String gender) {
		return By.xpath("//div[text()='"+gender+"']");
		
	}
	private By ageFrom = By.xpath("//div[contains(@class,'ageFrom')]//div[contains(@class,'is-selected')]");
	private By selectAge(String age) {
		return By.xpath("//div[text()='"+age+"']");
	}
	private By ageTo =By.xpath("//div[contains(@class,'ageUpto')]//div[contains(@class,'is-selected')]");
	
	private By ofReligion =By.xpath("//label[text()='of religion']/following-sibling::div//div[contains(@class,'is-selected')]");
	private By selectReligion(String religion) {
		return By.xpath("//div[text()='"+religion+"']");
	}
	private By motherTongue =By.xpath("//label[text()='and mother tongue']/following-sibling::div//div[contains(@class,'is-selected')]");
	private By selectMotherTongue(String Language) {
		return By.xpath("//div[text()='More']/following-sibling::div[text()='"+Language+"']");
	}
	private By btnBegin = By.xpath("//button[text()=\"Let's Begin\"]");
	
	public boolean validatehomepage(String gender) {
		driver.findElement(lookingFor).click();
		driver.findElement(lookingFor(gender)).click();
		driver.findElement(ageFrom).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(selectAge("25")));
		driver.findElement(selectAge("25")).click();
		driver.findElement(ageTo).click();
		driver.findElement(selectAge("30")).click();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(ofReligion).click();
		driver.findElement(selectReligion("Hindu")).click();
		driver.findElement(motherTongue).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(selectMotherTongue("Telugu")).click();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(btnBegin).click();
		Profilepage profile =new Profilepage();
				return profile.validateProfilePageisDisplayed();
	}

}
