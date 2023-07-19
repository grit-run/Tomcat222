package web.model;

public class Car {
    private String brand;
    private String model;
    private int prodYear;

    public Car(String brand, String model, int prodYear) {
        this.brand = brand;
        this.model = model;
        this.prodYear = prodYear;
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

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", production year = " + prodYear +
                '}';
    }
}
