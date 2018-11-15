import java.util.ArrayList;
import java.util.timer;
public class Engine{
  ArrayList<Body> bodies;
  double massMultiplier;
  private double g = 9.82;
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
    double t = 1000/fps;
    long now
    while(run){
      updateGame(t)

      now = System.millisTime();
      t -= last-now-t*fps; //Update to reach certain fps.
      last = now;
      try{Thread.sleep(t)};
    }
  }

  private void updateGame(double time){
    setForceVector(time);
  }

  public void addBody(Body body){
    bodies.add(body);
  }

  public void addBody( ArrayList<Body> bodies){
    this.bodies = bodies;
  }

  private double[] calcForceVector(Body b1, double time){
    Body b2;
    double[] force;
    for (int i = 0 ; i < bodies.size() ; i++) {
      b2 = bodies.get(i);
      double force = g*(b1)
    }
  }

  public void setForceVectors(double time){
    Body b1;
    for (int i = 0 ; i < bodies.size() ; i++) {
      Body b1 = bodies.get(i);
      if(b1.canMove())
        b1.setForceVector(calcForceVector(b1, time));
    }
  }

  public void moveObjects(){
    for (int i = 0 ; i < bodies.size() ; i++) {
      if()
    }
  }
}
