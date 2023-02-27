package assignmenttwo.solitares;

/**
 * Here i created a Planet class that holds name and average radius in km.
 */

public class Planet {
  private String name;
  private int avgRadiusInKm;
  
  public Planet(String newName, int newAvg) {
    setName(newName);
    setAvgRadiusInKm(newAvg);
  }
  
  public String getName() {
    return name;
  }
  
  private void setName(String newName) {
    if (newName == null || newName == "") {
      throw new IllegalArgumentException("The Name is invalid.");
    } else {
      this.name = newName;
    }
  }
  
  public Integer getAvgRadiusInKm() {
    return avgRadiusInKm;
  }
  
  private void setAvgRadiusInKm(int newAvg) {
    if (newAvg > 2000 && newAvg < 200000) {
      this.avgRadiusInKm = newAvg;
    } else {
      throw new IllegalArgumentException("The radius has to be between 2000km and 200 000km.");
    }
  }

  public String toString() {
    return "Planet: " + name + ", Average radius: " + Integer.toString(avgRadiusInKm) + "km";
  }
  
}

