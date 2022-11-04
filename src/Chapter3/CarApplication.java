package Chapter3;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("2021","1990", 5000);
        Car car2 = new Car("2022", "1904", 8000);

        System.out.printf("The model of the car is %s while the year is %s and the price %.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("The model of the car is %s while the year is %s and the price %.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());

        car1.dicountFirstCar();
        car2.dicountSecondCar();
        System.out.printf("The discount on first car %.2f%nThe Discount on the second car is %.2f%n", car1.getPrice(), car2.getPrice());

    }
}
