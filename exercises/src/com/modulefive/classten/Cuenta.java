package modulefive.classten;

/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales). Construye los siguientes métodos para la clase:
Un constructor, donde los datos pueden estar vacíos.
Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
mostrar(): Muestra los datos de la cuenta.
ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
 */

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
