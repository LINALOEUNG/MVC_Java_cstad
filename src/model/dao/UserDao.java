package model.dao;

import model.service.User;

import java.util.List;

public interface UserDao {
    User addNewUser(User user);
    void deleteUser(Integer id);
    List<User> getAllUsers();
    void updateUser(User user);
}

