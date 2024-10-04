// Create and call a class constructor of MyClass

public class MyClass {
  int x;
  public MyClass() {
    x = 5;
  }
  public static void main(String[] args) {
    MyClass myObj = new MyClass(); 
    System.out.println(myObj.x);
  }
}
