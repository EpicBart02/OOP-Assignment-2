package assignmenttwo.refactoredsolitares;

/**
 * This is the moon class that borrows from the heavenly body abstract class. 
 * It is basically a sub class of Heavenly body.
 */

public class Moon extends HeavenlyBody {
  
  public Moon(String newName, int newAvg) {
    super(newName, newAvg);
  }

  /**
   * This is a class that checks the average radius. If it is too small, we throw an illegal argument.
   */
  
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 6 || radius > 10000) {
      throw new IllegalArgumentException("The radius has to be between 7km and 10 000km.");
    }
  }

  public String toString() {
    return "Moon: " + super.toString();
  }  
}
