package ntu.nguyenhominhthanh_63135460.recylerviewpage2;

public class LandScape {
    String landImageFileName;
    String landCation;

    public LandScape(String landImageFileName, String landCation) {
        this.landImageFileName = landImageFileName;
        this.landCation = landCation;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
