public class User {
    private int UserId;
    public User()
    {
        UserId = UserIdsGenerator.getInstance().generateId();
    }
    public int getUserId() {
        return UserId;
    }
}
