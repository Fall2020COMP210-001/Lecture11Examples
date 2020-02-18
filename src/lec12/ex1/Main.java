package lec12.ex1;

import java.util.ArrayList;
import java.util.List;

import lec12.sortedlist.SortedList;
import lec12.sortedlist.ArraySortedList;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();

		for (int i=0; i<10; i++) {
			people.add(new RandomPerson());
		}
		
		System.out.println(people);
		people.sort(null);
		System.out.println(people);
	}
}
