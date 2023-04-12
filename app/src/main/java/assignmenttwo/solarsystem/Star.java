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

  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    setName(name);
    checkAvgRadiusInKm(avgRadiusInKm);
    planets = new ArrayList<Planet>();
    new ArrayList<Moon>();
  }

  /**
   * constructor to addplanet.
   */

  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    planets.add(planet);
    return planet;
  }

  /**
   * getter for heavenlybody.
   */

  public HeavenlyBody[] getHeavenlyBodies() {
    int length = planets.size() + 1;
    for (Planet planium : planets) {
      length += planium.moons.size();
    }
    HeavenlyBody[] copy = new HeavenlyBody[length];
    Star cope = new Star(getName(), getAvgRadiusInKm());
    copy[0] = cope;
    int checkster = 1;
    for (int i = 0; i < planets.size(); ++i) {
      Planet copium = new Planet(planets.get(i).getName(), planets.get(i).getAvgRadiusInKm(),
            planets.get(i).getAvgOrbitRadiusInKm());
      copy[checkster] = copium;
      checkster++;
    }
    for (Planet planium : planets) {
      for (Moon moonioom : planium.moons) {
        Moon copiummoon = new Moon(moonioom.getName(), moonioom.getAvgRadiusInKm(),
            moonioom.getAvgOrbitRadiusInKm());
        copy[checkster] = copiummoon;
        checkster++;
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

  /**
   * amogus.
   */
  public String toString() {
    String pin = "Star: " + getName() + " average radius " + getAvgRadiusInKm() + " \n "; 
    for (Planet i : planets) {
      pin += i;
    }
    return pin;
  }
}
