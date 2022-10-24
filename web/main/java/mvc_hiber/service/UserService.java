package mvc_hiber.service;

import mvc_hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
}
