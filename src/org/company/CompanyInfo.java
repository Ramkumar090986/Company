package org.company;

import org.client.Client;

public class CompanyInfo extends Client {
	
	public void companyName() {
		System.out.println("Company Name:Wipro");

	}
	
	public static void main(String[] args) {
		CompanyInfo c1=new CompanyInfo();
		c1.companyName();
		c1.clientName();
	
}
}
