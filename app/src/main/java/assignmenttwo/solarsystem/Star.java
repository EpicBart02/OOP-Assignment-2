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
    int length = 1; 
    for (Planet planet : planets) {
      length += planet.getHeavenlyBodies().length;
    }

    HeavenlyBody[] copy = new HeavenlyBody[length];
    Star starCopy = new Star(getName(), getAvgRadiusInKm(), getAvgTemp());
    copy[0] = starCopy;

    int h = 1;
    for (Planet planet : planets) {
      HeavenlyBody[] planetBodies = planet.getHeavenlyBodies();
      for (int i = 0; i < planetBodies.length; i++) {
        copy[h] = planetBodies[i];
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
    String pin = "Star: " + getName() + ", average radius " + getAvgRadiusInKm() + ", average tmep is " + getAvgTemp() 
        + "C" + " \n "; 
    for (Planet i : planets) {
      pin += i;
    }
    return pin;
  }
}
