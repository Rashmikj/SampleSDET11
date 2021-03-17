package com.crm.contactTest;

import org.testng.annotations.Test;

public class CreateOrganisationTest {


	@Test(groups="smokeTest")
	public void createOraganisatio() {
		System.out.println("execute create Organisation");
	}

	@Test(groups="regressionTest")
	public void createOrganisationwithIndustry() {
		System.out.println("execute create contact with Organisation");
	}

}
