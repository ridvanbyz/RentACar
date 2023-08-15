public class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int dailyRentalPrice;



    public Vehicle(){

    }
    public Vehicle(int id,String brand,String model,int dailyRentalPrice){
        this.setId(id);
        this.setBrand(brand);
        this.setModel(model);
        this.setDailyRentalPrice(dailyRentalPrice);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getDailyRentalPrice() {
        return dailyRentalPrice;
    }

    public void setDailyRentalPrice(int dailyRentalPrice) {
        this.dailyRentalPrice = dailyRentalPrice;
    }
}
