import java.util.ArrayList;
public class Engine{
  ArrayList<Body> bodies;
  double massMultiplier;

  public Engine(double massMultiplier){
    this.massMultiplier = massMultiplier;
    bodies = new ArrayList<Body>();
  }

  public Engine(double massMultiplier, ArrayList<Body> bodies){
    this.massMultiplier = massMultiplier;
    this.bodies = bodies;
  }

  public void addBody(Body body){
    bodies.add(body);
  }

  public void addBody( ArrayList<Body> bodies){
    this.bodies = bodies;
  }

  public double[] getAccVector(Body b1){
    Body b2;
    double[] acc;
    for (int i = 0 ; i < bodies.size() ; i++) {
      b2 = bodies.get(i);
      // acc[0] += TODO
      // acc[1] += TODO
    }
  }
}
