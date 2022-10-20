package service;

import model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    User getUserById(long id);

    void removeUser(long id);
}