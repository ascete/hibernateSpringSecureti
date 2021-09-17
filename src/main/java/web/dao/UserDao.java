package web.dao;

import web.models.Role;
import web.models.User;

import java.util.List;
import java.util.Set;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();

    User getUserByName(String username);


}
