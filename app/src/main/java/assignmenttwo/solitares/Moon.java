package assignmenttwo.solitares;

public class Moon {
    private String name;
    private int avgRadiusInKm;
    
    public Moon(String newName, Integer newAvg) {
      setName(newName);
      setAvgRadiusInKm(newAvg);
    }
  
    public String getName() {
      return name;
    }
    
    private void setName(String newName) {
      this.name = newName;
    }
  
    public Integer getAvgRadiusInKm() {
      return avgRadiusInKm;
    }
  
    private void setAvgRadiusInKm(int newAvg) {
      if (newAvg > 6 && newAvg < 10000) {
        this.avgRadiusInKm = newAvg;
      } else {
        throw new IllegalArgumentException("The radius has to be between 6km and 10 000km.");
      }
    }
  
    public String toString() {
        return "Moon: " + name + ", Average radius: " + Integer.toString(avgRadiusInKm) + "km";
      }
  
  }