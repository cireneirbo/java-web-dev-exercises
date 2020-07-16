package exercises.technology;

public class Computer {

    private String brandName = "";
    private double storageSizeInGigabytes = 0;
    private boolean isConnectedToInternet = false;

    public Computer(String brandName, double storageSizeInGigabytes, boolean isConnectedToInternet) {
        this.brandName = brandName;
        this.storageSizeInGigabytes = storageSizeInGigabytes;
        this.isConnectedToInternet = isConnectedToInternet;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getStorageSizeInGigabytes() {
        return storageSizeInGigabytes;
    }

    public void setStorageSizeInGigabytes() {
        this.storageSizeInGigabytes = storageSizeInGigabytes;
    }

    public boolean isConnectedToInternet() {
        return isConnectedToInternet;
    }

    public void setConnectedToInternet(boolean connectedToInternet) {
        isConnectedToInternet = connectedToInternet;
    }


}