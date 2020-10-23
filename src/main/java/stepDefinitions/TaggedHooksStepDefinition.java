package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDefinition {
	
	@Before(order=0)
	public void setUP(){
		System.out.println("*************** TESTS STARTS **************");
		
	}

	@After(order=0)
	public void tearDown(){
		System.out.println("*************** END **************");
	}
	
}
