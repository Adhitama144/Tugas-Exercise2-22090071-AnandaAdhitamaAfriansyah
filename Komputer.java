package komputer;

import java.util.ArrayList;
import java.util.List;

public class Komputer {
    
  private String brand;
    private String model;
    private String diskType;
    private int diskSize;
    private int ramSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType.toUpperCase();
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ram) {
        this.ramSize = ram;
    }
}