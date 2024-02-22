package com.testme;
/* This is project to convert Java class to Json file and 
 * From Json file to Java Object
 * 
 */
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJSON {

	public static void main(String[] args) throws Exception {
		// From Java class to JSON using Jacson API.. check pom
		Address address = new  Address("10/20","Indore", "M.P", 456010);
		Customer customer = new Customer(101,"Ram", "Lal",address);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Customer.json"), customer);
		System.out.println("Json file Created");
	}

}
