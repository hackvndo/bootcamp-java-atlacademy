package modulefive.classten;

public class Cuenta {

    private String holder;
    private double quantity;

    public Cuenta() {}

    public Cuenta(String holder, double quantity) {
        this.holder = holder;
        this.quantity = quantity;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "holder= '" + holder + '\'' +
                ", quantity= $" + quantity +
                '}';
    }

    public void showBalance() {
        System.out.println(this.toString());
    }

    public void depositCash(double quantity) {
        if (quantity < 0) {
            System.out.println("Negative number ERROR, please, check it and try again.");
        }
        this.quantity += quantity;
    }

    public void withdrawCash(double quantity) {
        if (quantity > this.quantity) {
            System.out.println("Insufficient funds.");
        }
        this.quantity -= quantity;
    }
}
