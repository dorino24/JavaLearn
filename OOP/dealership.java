public class dealership {
    private car[] cars;

    public dealership(car[] cars){
        this.cars = new car[cars.length];
        for(int i= 0; i < cars.length; i++){
            this.cars[i] = new car(cars[i]);
        }
    }

    public car getCar(int index){
        return new car(this.cars[index]);
    }

    public void setCar(int index, car newCar){
        this.cars[index] = new car(newCar);
    }


    public void sellCar(int index){
      this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
