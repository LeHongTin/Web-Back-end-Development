package exercise.groceryBill;

public class Item {
    public String name;
    public double price;
    public double discount = 0;

    public Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getInfor(){
        return "Item " + this.name + " with price " + this.price;
    }
}
