package ca.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    System.out.println("Hello, world!!");

    System.out.println(a + b);

    kvadrat(a);
    kvadrat(b);
  }

  public static void kvadrat(int a) {
    System.out.println("Kvadrat = " + (a * a));
  }
}