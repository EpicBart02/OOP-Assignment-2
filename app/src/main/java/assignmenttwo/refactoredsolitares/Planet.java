package assignmenttwo.refactoredsolitares;

/**
 * This is the Planet class that borrows from the heavenly body abstract class. 
 * It is basically a sub class of Heavenly body.
 */

public class Planet extends HeavenlyBody {
  
  public Planet(String newName, int newAvg) {
    super(newName, newAvg);
  }
  
  /**
   * This is a class that checks the average radius. If it is too small, we throw an illegal argument.
   */

  public void checkAvgRadiusInKm(int radius) {
    if (radius < 2000 || radius > 200000) {
      throw new IllegalArgumentException("The radius has to be between 2000km and 200 000km.");
    }
  }
  
  public String toString() {
    return "Planet: " +  super.toString();
  }
}
