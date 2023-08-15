public class Bike extends Vehicle {
    private Boolean hasBasket;

    public Bike(int id,String brand,String model,int dailyRentalPrice,Boolean hasBasket){
        super(id,brand,model,dailyRentalPrice);
        this.setHasBasket(hasBasket);
    }

    public String toString(){
        return ("Bike : "+getBrand()+getModel()+" Daily rental price: "+getDailyRentalPrice()+" Has basket: "+ getHasBasket());
    }

    public Boolean getHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(Boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}
