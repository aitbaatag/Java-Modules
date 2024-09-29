
public class User {
    private int id;
    private String name;
    private int balance;

    public User(String name, int id, int balance) throws IllegalAccessException {
        this.name = name;
        this.id = id;
        this.balance = balance;
        if (balance < 0)
            throw new IllegalAccessException("Balance cannot be negative.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}