package assignmenttwo.solarsystem;

/**
* abstract class for heavenlybody.
*/

public abstract class HeavenlyBody implements java.lang.Comparable<HeavenlyBody> {
  
  private String name;
  private Integer avgRadiusInKm;
  private Integer averageTemperature;
  
  public HeavenlyBody() {}
  
  protected HeavenlyBody(String name, int avgRadiusInKm, int temp) {
    this.name = name;
    this.avgRadiusInKm = avgRadiusInKm;
    this.averageTemperature = temp;
  }
  
  public String getName() {
    return name;
  }
  
  /**
  * name setter.
  */
  
  public void setName(String newName) {
    if (newName == null || newName.equals("")) {
      throw new IllegalArgumentException("The Name is invalid.");
    } else {
      this.name = newName;
    }
  }
  
  public int getAvgRadiusInKm() { 
    return avgRadiusInKm;
  }
  
  public void setAvgRadiusInKm(int radius) {
    this.avgRadiusInKm = radius;
  }

  public int getAvgTemp() {
    return averageTemperature;
  }

  public void setAvgTemp(int temp) {
    this.averageTemperature = temp;
  }
  
  protected abstract void checkAvgTemp(int temp);

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
