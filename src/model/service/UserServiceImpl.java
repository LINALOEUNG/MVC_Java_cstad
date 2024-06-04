package model.service;

import mapper.Mapper;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import model.dto.UserDto;
import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<UserDto>getAllUser() {
        return userDao.getAllUsers()
                .stream()
                .map(Mapper::mapFromUserToUserDto)
                .toList();
    }

    @Override
    public List<UserDto>addNewByUser(User user) {
        userDao.addNewUser(user);
        return List.of();
    }

    @Override
    public List<UserDto> deleteByUser(Integer id) {
        userDao.deleteUser(id);
        return List.of();
    }

}
