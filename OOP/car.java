import java.util.Arrays;

public class car{
    private String make;
    private String model;
    private int year;
    private String color;
    private String[] part;

    public car(String make, String model, int year, String color, String[] part){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.part = Arrays.copyOf(part, part.length);
    }

    // copy constructor
    public car(car source){
        this.make = source.make;
        this.model = source.model;
        this.year = source.year;
        this.color = source.color;
        this.part = Arrays.copyOf(source.part,source.part.length);
    }

    // getter 
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public String[] getparts(){
        return Arrays.copyOf(part, part.length);
    }

    // setter
    public String setMake(String make){
        return this.make = make;
    }

    public String setModel(String model){
        return this.model = model;
    }

    public int setYear(int year){
        return this.year = year;
    }

    public String setColor(String color){
        return this.color = color;
    }

    public String[] setParts(String[] part){
        return this.part = Arrays.copyOf(part, part.length);
    }

    public void drive(){
        System.out.println("Driving the "+make+" "+model+" "+year+" "+color);
    }

    public String toString(){
        return "Make: "+make+" Model: "+model+" Year: "+year+" Color: "+color+" Parts: "+Arrays.toString(part);
    }

}