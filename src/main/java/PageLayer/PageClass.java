package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PageClass extends BaseClass {
	
@FindBy(name="firstName")
private WebElement fname;

@FindBy(name="lastName")
private WebElement lname;

public PageClass() {
	
	PageFactory.initElements(driver,this);
}

public void enterUserNameAndLastName(String fName,String lName) {
	
	Wait.sendKeys(fname, fName);
	Wait.sendKeys(lname, lName);
}
}
