package seminar5.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String createUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
}
