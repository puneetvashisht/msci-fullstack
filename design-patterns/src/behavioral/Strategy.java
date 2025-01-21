package behavioral;

//Behavioral design patterns in Java focus on communication between objects, making it easier to assign responsibilities, and promoting loose coupling


// This pattern allows a family of algorithms to be defined, encapsulated, and made interchangeable.

// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete strategies
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Context class
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Main method
public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using credit card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);
    }
}

