package javaRush;

public class Solution {
	Inner inner;
	
	class Inner {
        Inner() {
            System.out.println("gg");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("kk");
        }
    }
}
