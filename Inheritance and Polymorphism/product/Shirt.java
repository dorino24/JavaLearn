package product;

public class Shirt extends Product {

    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Shirt(double price, String color, String brand, Size size) {
        //superClass constructor
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Lay shirt flat and fold in half");
    }

    @Override
    public void wear() {
        System.out.println("Wearing my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

}
