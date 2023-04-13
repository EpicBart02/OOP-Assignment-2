package assignmenttwo.refactoredsolitares;

/**
 * This is an abstract class. It is a class that cannot be called upon,
 * but other classes can be subclasses of this. This means that every method here
 * get implemented in the subclasses. This helps sorting amongst others. 
 */

public abstract class HeavenlyBody {
  private String name;
  private int avgRadiusInKm;
  
  protected HeavenlyBody(String newName, int newAvg) {
    setName(newName);
    setAvgRadiusInKm(newAvg);
  }
  
  public String getName() {
    return name;
  }

  private void setName(String newName) {
    if (newName == null || newName.equals("")) {
      throw new IllegalArgumentException("The Name is invalid.");
    } else {
      this.name = newName;
    }
  }

  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  public void setAvgRadiusInKm(int newAvg) {
    checkAvgRadiusInKm(newAvg);
    this.avgRadiusInKm = newAvg;
  }

  protected abstract void checkAvgRadiusInKm(int avgRadius);
  
  public String toString() {
    return name + ", And the average radius is " + avgRadiusInKm + "km";
  }
}
