package assignmenttwo.solarsystem;

import java.util.ArrayList;

/**
* heavenlybody abstract class.
*/

public class Planet extends HeavenlyBody {
  
  private double avgOrbitRadiusInKm;
  ArrayList<Moon> moons;
  
  /**
  * constructor for planet.
  */
  
  protected Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm, int temp) {
    super(name, avgRadiusInKm, temp);
    setName(name);
    checkAvgRadiusInKm(avgRadiusInKm);
    checkAvgTemp(temp);
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Orbit radius is out of bounds!");
    } else {
      this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
    }
    moons = new ArrayList<Moon>();
  }
  
  /**
  * add moon method.
  */
  
  public Moon addMoon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm, int averageTemperature) {
    if (avgRadiusInKm > super.getAvgRadiusInKm() / 2) {
      throw new IllegalArgumentException("Out of bounds!");
    }
    
    Moon moon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm, averageTemperature);
    for (HeavenlyBody i : moons) {
      if (i.getName().equals(name))  {
        throw new IllegalArgumentException("Moon is already present!");
      }
    }
    moons.add(moon);
    return moon;
  }
  
  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }
  
  /**
  * heavenlybody array.
  */
  
  public HeavenlyBody[] getHeavenlyBodies() {
    HeavenlyBody[] copy = new HeavenlyBody[moons.size() + 1];
    Planet copy2 = new Planet(getName(), getAvgRadiusInKm(), getAvgOrbitRadiusInKm(), getAvgTemp());
    copy[0] = copy2;
    for (int i = 1; i < moons.size() + 1; ++i) {
      Moon copies = new Moon(moons.get(i - 1).getName(), moons.get(i - 1).getAvgRadiusInKm(),
          moons.get(i - 1).getAvgOrbitRadiusInKm(), i);
      copy[i] = copies;
    }
    return copy;
  }
  
  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 2000 || radius > 200000) {
      throw new IllegalArgumentException("Radius is out of bounds!");
    }
  }

  protected void checkAvgTemp(int temp) {
    if (temp < -218 || temp > 430) {
      throw new IllegalArgumentException("The temp is out of bounds, please pick a temprature between -218C and 430C");
    }
  }
  
  /**
  * tostring.
  */
  public String toString() {
    String in = " Planet: " + getName() + " average radius " + getAvgRadiusInKm() + "km " 
        + ", average orbit radius " + getAvgOrbitRadiusInKm() + "km" + " \n ";
    for (Moon i : moons) {
      in += i;
    }
    return in;
  }
}
