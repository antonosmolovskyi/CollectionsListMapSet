package javaRush;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Object> elements = new ArrayList<>();
		elements.add("Привет");
		elements.add(10);
		elements.add(new Integer[15]);
		elements.add(new LinkageError());
		Object o = new Object();
		System.out.println(o.toString());
		
		//checkElementsType(elements);
	}

	public static void checkElementsType(ArrayList<Object> elements) {
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i));
		}
		System.out.println("_________________________");
		Iterator<Object> iterator = elements.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void printString() {
		System.out.println("Строка");
	}

	public static void printInteger() {
		System.out.println("Целое число");
	}

	public static void printIntegerArray() {
		System.out.println("Массив целых чисел");
	}

	public static void printUnknown() {
		System.out.println("Другой тип данных");
	}
}
