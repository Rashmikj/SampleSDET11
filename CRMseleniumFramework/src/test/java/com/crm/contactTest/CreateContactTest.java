package com.crm.contactTest;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups="smokeTest")
	public void createContact() {
		System.out.println("execute create contact");
	}

	@Test(groups="regressionTest")
	public void createContactwithIndustry() {
		System.out.println("execute create contact with industry");
	}

}
