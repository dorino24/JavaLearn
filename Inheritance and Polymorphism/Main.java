import product.Pants;
import product.Product;
import product.Shirt;

public class Main {
    public static void main (String[] args) {
        Shirt shirt = new Shirt(30, "blue", "Nike", Shirt.Size.MEDIUM);
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(50, "black", "Adidas", 32, 34);
        pants.fold();
        productStore(pants);
        
    }

    // POLYMORPHISM
    // Better to this method to handle all types of products (polymporphism)
    public static void productStore(Product product){
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName() + ". Your total come to " + product.getPrice());    
        product.wear();
    }

    // rather than create a method for each type of product
    public static void pantsStore(Pants pants){
        System.out.println("Thank you for purchasing " + pants.getBrand() + " pants. Your total come to " + pants.getPrice());    
    }
    public static void shirtStore(Shirt shirt){
        System.out.println("Thank you for purchasing " + shirt.getBrand() + " shirt. Your total come to " + shirt.getPrice());    
    }
}
