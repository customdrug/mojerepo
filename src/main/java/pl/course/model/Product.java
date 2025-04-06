package pl.course.model;

public class Product {
    private String name;
    private int wage;
    private int price;
    private int supplyAmount;


    public Product() {
    }

    public Product(String name, int wage, int price, int supplyAmount) {
        this.name = name;
        this.wage = wage;
        this.price = price;
        this.supplyAmount = supplyAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getPrice() {
        return price;
    }
    public int getSupplyAmount() {
        return supplyAmount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + ' ' +
                " Waga w gramach: " + wage +
                " Cena w złotówkach: " + price +
                " Ilość dostępnych sztuk: " + supplyAmount;
    }
}
