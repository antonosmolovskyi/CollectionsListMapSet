package javaRush;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethodMain {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		/*Collections.reverse(list);
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("_____________");
		Collections.replaceAll(list, 3, 5);
		for(Integer i : list) {
			System.out.println(i);
		}
		
		list.add(43);
		list.add(76);
		list.add(13);
		for(Integer i : list) {
			System.out.println(i);
		}
		System.out.println("___________");
		Collections.sort(list);
		for(Integer i : list) {
			System.out.println(i);
		}
		
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.rotate(list, 3);
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.shuffle(list);
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		*/
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		list.add(3);
		list.add(3);
		list.add(4);
		System.out.println();
		int count = Collections.frequency(list, 3);
		System.out.println(count);
	}
}
