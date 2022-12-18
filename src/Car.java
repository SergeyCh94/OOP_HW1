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

    Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand == ""){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model == ""){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null || country == ""){
            this.country = "default";
        } else {
            this.country = country;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color == "") {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

    }

}