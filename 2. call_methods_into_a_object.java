/* Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program. */

public class Main {
	public void fullThrottle() {
    System.out.println("The car is going as fast as it can...");
  }
    public void speed(int maxSpeed) {
  	System.out.println("Speed: " + maxSpeed);  
  }
  public static void main(String[] args) {
  	Main myCar = new Main();
	  myCar.fullThrottle();
    myCar.speed(200);
  }
}
