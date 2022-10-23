package mvc_hiber.service;

import mvc_hiber.dao.UserDAO;
import mvc_hiber.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {

    }

    @Override
    @Transactional
    public User getUser(Long id) {
        return userDAO.getUser(id);
    }
    @Override
    @Transactional
    public void removeUser(Long id) {

    }



}
