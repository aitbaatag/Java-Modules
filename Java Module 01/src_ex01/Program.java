public class Program {
    public static void main(String[] args) {
        User user1 = new User(); // Create a new User
        User user2 = new User(); // Create another User

        System.out.println("User 1 ID: " + user1.getUserId()); // Prints the ID of the first user
        System.out.println("User 2 ID: " + user2.getUserId()); // Prints the ID of the second user
    }
}
