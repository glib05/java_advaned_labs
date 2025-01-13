
class Car {

    /** The brand of the car. */
    String brand;

    /** The number of months since the car was produced. */
    int monthsSinceProduction;

    /** The class of the car (e.g., A, B, C, D, E). */
    String carClass;

    /** The price of the car. */
    double price;

    /**
     * Constructs a new {@code Car} with the specified brand, months since production,
     * class, and price.
     *
     * @param brand the brand of the car
     * @param monthsSinceProduction the number of months since the car was produced
     * @param carClass the class of the car
     * @param price the price of the car
     */
    public Car(String brand, int monthsSinceProduction, String carClass, double price) {
        this.brand = brand;
        this.monthsSinceProduction = monthsSinceProduction;
        this.carClass = carClass;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", monthsSinceProduction=" + monthsSinceProduction +
                ", carClass='" + carClass + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * Returns the brand of the car.
     *
     * @return the brand of the car
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Returns the number of months since the car was produced.
     *
     * @return the number of months since production
     */
    public int getMonthsSinceProduction() {
        return monthsSinceProduction;
    }

    /**
     * Generates a random car with random brand, age, category, and price.
     *
     * @return a randomly generated {@code Car} object
     */

}


