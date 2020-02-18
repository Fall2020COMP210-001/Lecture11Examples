package lec12.sortedlist;

public interface SortedList<T> {

	int look(T element);
	void remove(int index);
	T get(int index);
	int find(T element);
	int size();
	boolean isEmpty();
}
