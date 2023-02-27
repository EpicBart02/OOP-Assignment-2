package assignmenttwo.solitares;

/**
 * This is a Star class that holds name and avergae radius.
 */

public class Star {
  private String name;
  private int avgRadiusInKm;
  
  
  public Star(String newName, Integer newAvg) {
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
  
  private void setAvgRadiusInKm(Integer newAvg) {
    if (newAvg >= 16700) {
      avgRadiusInKm = newAvg;
    } else {
      throw new IllegalArgumentException("The radius is too low, it has to be 16 700km and above.");
    }
  }
  
  public String toString() {
    return "Star: " + name + ", Average radius: " + Integer.toString(avgRadiusInKm) + "km";
  }
  
}
