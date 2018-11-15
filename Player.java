public class Player extends Body{
  Body shot;

  public Player(double x,double y, double size, double mass, boolean moveable, Body shot){
    super(x, y, size, mass, moveable);
  }

  public void shoot(double x1, double y1, double x2, double y2){
    shot = new Body(pos[0], pos[1], 20.0, 100.0, true);
    shot.setForceVector(new double[]{(x2-x1), (y2-y1)});
  }

}
