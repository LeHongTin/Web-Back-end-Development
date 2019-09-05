package exercise.groceryBill;
import java.util.Date;

public class GroceryBill {
    private Customer customer;
    private Date dateOfOrder;

    public GroceryBill(Customer customer, Date dateOfOder){
        this.customer = customer;
        this.dateOfOrder = dateOfOder;
    }

    public void add(Item i) {

    }

    public double getTotal(){
        return 3;
    }

    public void printReceipt(){
        System.out.println("A List of item ");
    }

}
