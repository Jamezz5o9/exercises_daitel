package Chapter3;

public class Car {

    private String model;
    private String year;
    private double price;


    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;

        if(price > 0.00){
            this.price = price;
        }

    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void dicountFirstCar(){
        price *= 0.07;
    }
    public void dicountSecondCar(){
        price *= 0.05;
    }


}