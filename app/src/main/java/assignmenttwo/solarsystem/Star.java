package assignmenttwo.solarsystem;

import java.util.ArrayList;

/**
 * class for star.
 */

public class Star extends HeavenlyBody {
    
  private ArrayList<Planet> planets;

  /**
   * constructor for star.
   */

  public Star(String name, int avgRadiusInKm, int averageTemperature) {
    super(name, avgRadiusInKm, averageTemperature);
    setName(name);
    checkAvgRadiusInKm(avgRadiusInKm);
    planets = new ArrayList<Planet>();
    new ArrayList<Moon>();
  }

  /**
   * constructor to addplanet.
   */

  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm, int temp) {
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm, temp);
    planets.add(planet);
    return planet;
  }

  /**
   * getter for heavenlybody.
   */

  public HeavenlyBody[] getHeavenlyBodies() {
    int length = planets.size() + 1;
    for (Planet planet : planets) {
      length += planet.moons.size();
    }
    HeavenlyBody[] copy = new HeavenlyBody[length];
    Star cope = new Star(getName(), getAvgRadiusInKm(), getAvgTemp());
    copy[0] = cope;
    int h = 1;
    for (int i = 0; i < planets.size(); ++i) {
      Planet copies = new Planet(planets.get(i).getName(), planets.get(i).getAvgRadiusInKm(),
            planets.get(i).getAvgOrbitRadiusInKm(), planets.get(i).getAvgTemp());
      copy[h] = copies;
      h++;
    }
    for (Planet planet : planets) {
      for (Moon moon : planet.moons) {
        Moon mooncopy = new Moon(moon.getName(), moon.getAvgRadiusInKm(),
            moon.getAvgOrbitRadiusInKm(), moon.getAvgTemp());
        copy[h] = mooncopy;
        h++;
      }
    }
    return copy;
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 16700) {
      throw new IllegalArgumentException("Radius is out of bounds!");
    }
  }

  protected void checkAvgTemp(int temp) {
    if (temp < 10000) {
      throw new IllegalArgumentException("The temp is out of bounds, please pick a temprature over 10.000 C");
    }
  }

  /**
   * Prints string.
   */
  public String toString() {
    String pin = "Star: " + getName() + ", average radius " + getAvgRadiusInKm() + " \n "; 
    for (Planet i : planets) {
      pin += i;
    }
    return pin;
  }
}
