package lec12.ex1;

public interface Person extends Comparable<Person> {

	String getName();
	double getFame();
	double getLove();
	double getMoney();
	double getHappiness();	
	int compareTo(Person other);
}
