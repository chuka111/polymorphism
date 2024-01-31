package Productv5;

//import ie.atu.productv3.Product;

public class TV  extends Product {
    private String screenSize;
    private String manufacture;

    protected static int count = 0;

    public TV() {
        super();
        screenSize = "";
        manufacture = "";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + "\n" + screenSize;
    }
}
