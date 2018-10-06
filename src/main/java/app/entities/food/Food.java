package app.entities.food;

abstract public class Food {
    protected String brand;
    protected double weight;
    protected double price;

    public Food() {
    }

    public Food(String brand, double weight, double price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
