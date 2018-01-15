package com.confiz.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExcersizeJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Lewis", 26), 
				new Person("Ali", "Ahmad", 25),
				new Person("Jhon", "Snow", 24), 
				new Person("Doe", "Jhon", 23), 
				new Person("Junaid", "Subhani", 22));

		System.out.println("Person list unSorted");
		printConditionally(people, p -> true);
		// sort the list by last name
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// Print all members of list<Person>
		System.out.println("Person list Sorted");
		printConditionally(people, p -> true);

		// Print all members of list<Person> starting last name with S
		System.out.println("Person list Starting Last NAme with S");
		printConditionally(people, p -> p.getLastName().startsWith("S"));
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.println(p.toString());
		}
	}
}

interface Condition {
	boolean test(Person p);
}