package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> getAllUsers();

    void userEdit(User user);

    void userDelete(User user);

    User findUserById(Long id);
}
