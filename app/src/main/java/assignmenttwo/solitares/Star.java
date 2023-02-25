package assignmenttwo.solitares;

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
      this.name = newName;
    }
  
    public Integer getAvgRadiusInKm() {
      return avgRadiusInKm;
    }
  
    private void setAvgRadiusInKm(Integer newAvg) {
      if (newAvg >=16700) {
        avgRadiusInKm = newAvg;
      } else {
        throw new IllegalArgumentException("The radius is too low, it has to be 16 700km and above.");
      }
    }
      
    public String toString() {
        return "Star: " + name + ", Average radius: " + Integer.toString(avgRadiusInKm) + "km";
      }
  
  }
  