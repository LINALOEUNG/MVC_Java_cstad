package model.dao;
import model.service.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private List<User> userList = new ArrayList<>(
            List.of(new User(1,"nana","lin8296@gmail.com"),
                    new User(2,"lina","linag8296@gmail.com"))
    );
    @Override
    public User addNewUser(User user) {
        userList.add(user);
        return user;
    }
    @Override
    public void deleteUser(Integer id) {
        userList.removeIf(a->a.getId().equals(id));
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
    @Override
    public void updateUser(User user) {

    }
}
