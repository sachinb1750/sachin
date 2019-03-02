package com.sachin.client;

import java.io.File;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sachin.binding.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Marshalling : converting Java Object into XML
		Employee emp = new Employee();
		emp.setEmpNo(101);
		emp.setName("Sachin");
		emp.setSalary(50000);

		JAXBContext context = null;
		// create jaxbcontext object - create using newinstance() method which is static
		// factory method
		try {
			context = JAXBContext.newInstance(Employee.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// create marshaller object from jaxbcontext
		try {
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(emp, System.out);
			
			File file = new File("emp2.xml");
			marshaller.marshal(emp, file);
			
			StringWriter writer = new StringWriter();
			marshaller.marshal(emp, writer);
			System.out.println("");
			System.out.println(writer.toString());
			
			System.out.println("Done");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// call marshall(-) from marshaller object

	}

}
