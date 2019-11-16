package ndcs.Model;


public interface UserDao {

    public int save(User user);
    public int update(User user);
    public User get(int id);
    public int delete(int id);
    public List<User> userList();
}