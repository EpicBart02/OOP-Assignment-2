package assignmenttwo.solarsystem;

/**
 * class for moon class.
 */

public class Moon extends HeavenlyBody {
  
  private double avgOrbitRadiusInKm;

  public Moon() {}

  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    setName(name);
    checkAvgRadiusInKm(avgRadiusInKm);
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Orbit radius is out of bounds!");
    } else {
      this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    }
  }

  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 6 || radius > 10000) {
      throw new IllegalArgumentException("Radius is out of bounds!");
    }
  }

  public String toString() {
    return "Moon :" + getName() + " average radius " + getAvgRadiusInKm() + "km " 
      + " average orbit radius " + getAvgOrbitRadiusInKm() + "km" + " \n ";
  }
}
