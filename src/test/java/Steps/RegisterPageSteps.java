package Steps;

import BaseLayer.BaseClass;
import PageLayer.PageClass;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{
	
	@When("user is on register page")
	public void user_is_on_register_page() {
		
		BaseClass.initialization();
	    
	}
	@When("user enter valid firstname and lastname")
	public void user_enter_valid_firstname_and_lastname() {
	   
		PageClass pageClass = new PageClass();
		pageClass.enterUserNameAndLastName("Vishal", "Badukale");
	}

}
