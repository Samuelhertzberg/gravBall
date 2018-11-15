import java.util.ArrayList;
import java.util.timer;
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

  public void start(int fps){
    gameLoop(fps);
  }

  private void gameLoop(int fps){
    boolean run = true;
    double last = System.millisTime();
    double REALDELAY = 1000/fps;
    long now
    while(run){
      now = System.millisTime();
      REALDELAY = last-now;
      last = now;
    }
  }

  public void addBody(Body body){
    bodies.add(body);
  }

  public void addBody( ArrayList<Body> bodies){
    this.bodies = bodies;
  }

  private double[] calcForceVector(Body b1){
    Body b2;
    double[] force;
    for (int i = 0 ; i < bodies.size() ; i++) {
      b2 = bodies.get(i);
      // force[0] += TODO
      // force[1] += TODO
    }
  }

  public void setForceVectors(){
    Body b1;
    for (int i = 0 ; i < bodies.size() ; i++) {
      Body b1 = bodies.get(i);
      b1.setForceVector(calcForceVector(b1));
    }
  }
}
