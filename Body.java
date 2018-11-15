public class Body{
  double pos[];
  double size;
  double mass;
  boolean moveable;
  double[] accVector;
  double[] speedVector;
  public Body(double x,double y, double size, double mass, boolean moveable){
    pos = new double[]{x,y};
    this.size = size;
    this.mass = mass;
    this.moveable = moveable;
  }

  public void move(double time){
    pos[0] += speedVector[0];
    pos[1] += speedVector[1];
    speedVector[0] += accVector[0]*time; //TODO might have to be delimited
    speedVector[1] += accVector[1]*time;
  }

  public void setForceVector(double[] accVector){
    this.accVector = accVector;
  }

  public double getX(){
    return pos[0];
  }

  public double getY(){
    return pos[1];
  }

  public double getSize(){
    return size;
  }

  public double getMass(){
    return mass;
  }

  public int drawX(){
    return (int)pos[0];
  }

  public int drawY(){
    return (int)pos[1];
  }

  public int drawMass(){
    return (int)mass;
  }
}
