public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " +
                color + " цвет кузова, обьем двигателя " + engineVolume + " - л.";
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }

}