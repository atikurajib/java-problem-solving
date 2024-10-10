// Type casting in java

// Widening casting:
public class Main {
	public static void main(String[] args) {
		    int x = 11;
        double y = x; // Automatic casting: int to double
        System.out.println(x);
        System.out.println(y);
    }
}

// Narrowing casting:
public class Main {
	public static void main(String[] args) {
    	  double x = 11.11d;
        int y = (int) x; // Manual casting: double to int
        System.out.println(x);
        System.out.println(y);
    }
}

