    public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    static int Id = 0;

    private UserIdsGenerator() // this class can created with new keyword
    {
        // This constructor cannot be accessed from outside this class (Cannot use new UserIdsGenerator() outside this class)
    }
    public static UserIdsGenerator getInstance()
    {
        if (instance == null)
            instance = new UserIdsGenerator();
        return instance;
    }
    public int generateId()
    {
        return Id++;
    }
}
