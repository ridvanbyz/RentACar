public class Car extends Vehicle {

    private int numberOfDoors;


    public Car(){

    }

    public Car(int id,String brand,String model,int dailyRentalPrice,int numberOfDoors){
        super(id,brand,model,dailyRentalPrice);
        this.setNumberOfDoors(numberOfDoors);

    }

    public String toString(){
        return("Car : "+getBrand()+" "+getModel()+" Daily rental price: "+getDailyRentalPrice()+" Number of doors: "+ getNumberOfDoors());
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
