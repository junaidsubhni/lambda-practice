package com.confiz.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExcersizeJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
			new Person("Charles","Lewis",26),
			new Person("Ali","Ahmad",25),
			new Person("Jhon","Snow",24),
			new Person("Doe","Jhon",23),
			new Person("Junaid","Subhani",22)
		);
		System.out.println("Person list unSorted");
		printAll(people);
		// sort the list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Print all members of list<Person>
		System.out.println("Person list Sorted");
		printAll(people);
		
		//Print all members of list<Person> starting last name with S
		System.out.println("Person list Starting Last NAme with S");
		printAllBeginningLastNameWithS(people);
	}

	private static void printAllBeginningLastNameWithS(List<Person> people) {
		for(Person p : people) {
			if(p.getLastName().startsWith("S"))
				System.out.println(p.toString());
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p.toString());
		}
		
	}

}
