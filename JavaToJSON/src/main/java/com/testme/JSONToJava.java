package com.testme;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToJava {

	public static void main(String[] args) throws Exception{
		// Json file converted to java Object"
		File file = new File("Customer.json");
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(file, Customer.class);
		System.out.println("Json file converted to java Object");
		System.out.println(customer);
		System.out.println("===================");
		System.out.println(customer.getCid());
		System.out.println(customer.getCName());
		System.out.println(customer.getCLastName());
		System.out.println(customer.getAddress().getStreet());
		System.out.println(customer.getAddress().getCity());
		System.out.println(customer.getAddress().getState());
		System.out.println(customer.getAddress().getZip());
	}

}
