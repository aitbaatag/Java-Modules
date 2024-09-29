import java.util.UUID;

public class Transaction {
    public enum TransferCategory {
        DEBITS,
        CREDITS
    }
    private UUID id;
    private User recipient;
    private User sender;
    private TransferCategory category;
    private int amount;

    public Transaction(User sender, User recipient, TransferCategory category, int amount) {
        this.id = UUID.randomUUID();
        this.recipient = recipient;
        this.sender = sender;
        this.category = category;
        this.amount = amount;

        // Validate transaction amounts
        if (category == TransferCategory.DEBITS && sender.getBalance() < amount) {
            throw new IllegalArgumentException("Sender has insufficient balance.");
        }
        if (category == TransferCategory.CREDITS && amount <= 0) {
            throw new IllegalArgumentException("Credit amount must be positive.");
        }
        if (category == TransferCategory.DEBITS)
            sender.setBalance(sender.getBalance() - amount);
        recipient.setBalance(recipient.getBalance() + amount);
    }

    public UUID getId() {
        return id;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public TransferCategory getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }
    public void print()
    {
        if (category == TransferCategory.DEBITS)
            System.out.println("Transfer Category :"+ TransferCategory.DEBITS.name());
        else
            System.out.println(" Transfer Category :"+ TransferCategory.CREDITS.name());
        System.out.println("Transaction ID :"+ getId());
        System.out.println("sender : " + sender.getName() + " -" + getAmount());
        System.out.println("balance sender : "+ sender.getBalance());
        System.out.println("recipient : "+ recipient.getName() + " +" + getAmount());
        System.out.println("balance recipient :"+ recipient.getBalance());
    }
}
