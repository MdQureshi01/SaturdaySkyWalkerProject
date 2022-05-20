package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before                                            //Before action will run before executing any scenario.
	public void beforeActions(Scenario scen) { 
		
		System.out.println("initialise the driver");
		SetupDrivers.SetupDriver();                   //Calling out the set up driver execute before scenario. 
		System.out.println(scen.getName());
		
	}

}
