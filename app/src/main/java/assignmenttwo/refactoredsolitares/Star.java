package assignmenttwo.refactoredsolitares;

/**
 * This is the Star class that borrows from the heavenly body abstract class. 
 * It is basically a sub class of Heavenly body.
 */

public class Star extends HeavenlyBody {
  
  public Star(String newName, int newAvg) {
    super(newName, newAvg);
  }
  
  /**
   * This is a class that checks the average radius. If it is too small, we throw an illegal argument.
   */

  public void checkAvgRadiusInKm(int radius) {
    if (radius < 16700) {
      throw new IllegalArgumentException("The radius has to be between above 16 700km.");
    }
  }
  
  public String toString() {
    return "Star: " + super.toString();
  } 
}
