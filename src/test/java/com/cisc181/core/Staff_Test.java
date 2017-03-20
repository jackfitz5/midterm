package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.eNums.eTitle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	@BeforeClass
	public static void setup1() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	


		static ArrayList<Staff> StaffTest = new ArrayList<Staff>();

		public static Date newDate(int year, int month, int day) 
		
		{	Calendar calender = Calendar.getInstance();
			
		calender.set(year, month, day);
			
					return calender.getTime();   
		}
		

		@BeforeClass
		public static void setup() throws PersonException {


			StaffTest.add(new Staff("Fitzpatrick", "John", "Christopher", newDate(1998, 11, 16), "address", "012-345-6789",
			"jackfitz@udel.edu", "time", 1, 12345, newDate(2017, 3, 1), eTitle.MRS));

			StaffTest.add(new Staff("Person", "Name", "Dude", newDate(1998, 1, 1), "drive", "123-456-7890",
			"person@verizon.net", "time", 2, 23456, newDate(1999, 8, 13), eTitle.MRS));

			StaffTest.add(new Staff("Man", "Kid", "Baby", newDate(2001, 1, 2), "main", "234-567-890",
			"man@gmail.com", "time", 3, 34567, newDate(1985, 1, 3), eTitle.MRS));

			StaffTest.add(new Staff("Derek", "Johnson", "Lady", newDate(1990, 9, 12), "street", "567-890-123",
			"derek@verizon.net", "time", 4, 45678, newDate(2014, 4, 12), eTitle.MR));

			StaffTest.add(new Staff("Johnny", "McDonald", "Person", newDate(1993, 1, 23), "howard", "678-901-234",
			"johnny@yahoo.com", "time", 5, 56789, newDate(2016, 6, 10), eTitle.MR));
		}

		

		@Test(expected = PersonException.class)
		public void testDOB() throws PersonException {

			new Staff("Jack", "Greg", "Andrew", newDate(1998, 11, 4), "Street", "012-345-6789",
					"jackfitz@udel.edu", "0", 0,0, newDate(2017, 4, 11), eTitle.MR);
		}
		
		

		@Test(expected = PersonException.class)
		
		public void testPhoneNumException() throws PersonException {
			
			new Staff("Fitzpatrick", "John", "Christopher", newDate(1998, 11, 16), "address", "123-456-7849",
					"jackfitz@udel.edu", "time", 4, 12345, newDate(2007, 3, 1), eTitle.MR);
		}
		
		
		@Test
		public void testSalary() throws PersonException {
			
			double sum = 0;
			
			for (Staff avg : StaffTest) {
				
				sum += avg.getSalary();
			}
			double average = sum/StaffTest.size();
			
			assertEquals(average, 34567, .01);
		}
	}