package StepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksSteps {
	
	@Before(value="@smoke",order =1)
	public void setUp() {
		System.out.println("In Before method");
	}
	
	@Before(value="@smoke",order =2)
	public void test() {
		System.out.println("In Before method2");
	}
	
	@Before(value="@Regression")
	public void m() {
		System.out.println("In Before method3");
	}
	
	@After
	public void tearDown() {
		System.out.println("In After method");
	}
	
	@BeforeStep
	public void m1() {
		System.out.println("In BeforeStep method");
	}
	
	@AfterStep
	public void m2() {
		System.out.println("In AfterStep method");
	}


	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("In Given method");

	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("In When menthod");

	}

	@And("some other action")
	public void some_other_action() {
		System.out.println("In And method");

	}


	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("In Then method");

	}

	@And("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("In And method");

	}




}
