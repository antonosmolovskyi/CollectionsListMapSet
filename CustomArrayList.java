package javaRush;

public class CustomArrayList {
	private int size;
	private int capacity;
	private String[] elements;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public CustomArrayList() {
		capacity = 10;
		size = 0;
		elements = new String[capacity];
	}

	public void add(String element) {
		if (size == capacity) {
			grow();
		}
		elements[size] = element;
		size++;
	}

	private void grow() {
		String[] elementCopy = new String[size + (size / 2)];
		for (int i = 0; i < elements.length; i++) {
			elementCopy[i] = elements[i];
		}
		elements = elementCopy;
		capacity += size / 2;
	}
	
	public void printInfo() {
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] != null)
			System.out.print(elements[i] + " ");
		}
	}
}
