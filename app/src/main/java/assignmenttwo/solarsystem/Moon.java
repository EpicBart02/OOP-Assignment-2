package assignmenttwo.solarsystem;

/**
 * class for moon class.
 */

public class Moon extends HeavenlyBody {
  
  private double avgOrbitRadiusInKm;

  public Moon() {}

  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm, int temp) {
    super(name, avgRadiusInKm, temp);
    setName(name);
    checkAvgRadiusInKm(avgRadiusInKm);
    checkAvgTemp(temp);
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

  protected void checkAvgTemp(int temp) {
    if (temp < -218 || temp > 430) {
      throw new IllegalArgumentException("The temp is out of bounds, please pick a temprature between -218C and 430C");
    }
  }

  public String toString() {
    return "    Moon: " + getName() + " average radius " + getAvgRadiusInKm() + "km " 
      + ", average orbit radius " + getAvgOrbitRadiusInKm() + "km" + " \n ";
  }
}
