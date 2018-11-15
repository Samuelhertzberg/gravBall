import java.lang.Math;
public class Main{
  public static void main(String[] args) {
    Engine e = new Enginge(Math.pow(10,7));
    Drawer d = new Drawer();
    e.start();
  }
}
