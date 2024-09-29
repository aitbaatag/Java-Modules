import java.util.UUID;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        // Create two users
        User alice = new User("Alice",1, 300);
        User bob = new User("Bob",2, 300);
        Transaction transaction = new Transaction(alice, bob, Transaction.TransferCategory.DEBITS, 200);
        transaction.print();
    }
}
