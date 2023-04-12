package assignmenttwo.solarsystem;

/**
* abstract class for heavenlybody.
*/

public abstract class HeavenlyBody implements java.lang.Comparable<HeavenlyBody> {
  
  private String name;
  private Integer avgRadiusInKm;
  
  public HeavenlyBody() {}
  
  protected HeavenlyBody(String name, int avgRadiusInKm) {
    this.name = name;
    this.avgRadiusInKm = avgRadiusInKm;
  }
  
  public String getName() {
    return name;
  }
  
  /**
  * name setter.
  */
  
  public void setName(String newName) {
    this.name = newName;
    if (newName == null || newName.equals("")) {
      throw new IllegalArgumentException("Name must not be null or empty!");
    } 
  }
  
  public int getAvgRadiusInKm() { 
    return avgRadiusInKm;
  }
  
  public void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = radius;
  }
  
  protected abstract void checkAvgRadiusInKm(int radius);
  
  public String toString() {
    return getName() + "  " + getAvgRadiusInKm() + "km";
  }
  
  /**
  * * compare to method for order in heaven.
  */
  
  public int compareTo(HeavenlyBody clk) {
    if (getAvgRadiusInKm() == clk.getAvgRadiusInKm()) {
      return 0;
    } else if (getAvgRadiusInKm() > clk.getAvgRadiusInKm()) {
      return 1;
    } else {
      return -1;
    }
  }
}
