// java math

public class Main {
	
    public static void main(String[] args) {
    	int a = 5, b = 15, c = 25, d = -35;
        
        System.out.print("The two numbers 'a' and 'b' are: ");
        System.out.print(a + "," + " ");
        System.out.println(b);
        // the output will be 5, 15
        
        System.out.print("The maximum number is: ");
    	System.out.println(Math.max(a, b)); // the output will be 15
        
        System.out.print("The minimum number is: ");
        System.out.println(Math.min(a, b)); // the output will be 5
        
        System.out.print("The Square root of c is: ");
        System.out.println(Math.sqrt(c)); // the output will be 5
        
        System.out.print("The absolute positive value of d is: ");
        System.out.println(Math.abs(d)); // the output will be 35
        
        System.out.print("The negative value of b is: ");
        System.out.println((int) -b); // the output will be -15
    
    }
}
