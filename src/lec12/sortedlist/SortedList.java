package lec12.sortedlist;

public interface SortedList<T extends Comparable<T>> {

	void clear();
	void add(T element);
	T remove(int index);
	T get(int index);
	default int find(T element) {
		int idx = look(element);
		return (get(idx).compareTo(element) == 0) ? idx : -1;
	}
	default int look(T element) {
		if (isEmpty()) {
			return 0;
		}
		
		int low = 0;
		int high = size()-1;

		if (element.compareTo(get(low)) < 0) {
			return 0;
		}
		if (element.compareTo(get(high)) > 0) {
			return size();
		}
		while (low < high) {
			int middle = (low+high) / 2;
			T middle_element = get(middle);
			if (element.compareTo(middle_element) > 0) {
				low = middle+1;
			} else if (element.compareTo(middle_element) < 0) {
				high = middle;
			} else {
				while (middle > 0 && element.compareTo(get(middle-1)) == 0) {
					middle--;
				}
				return middle;
			}
		}
		// low == high == where the element should go
		return low;
	}
	int size();
	default boolean isEmpty() {
		return (size() == 0);
	}
}
