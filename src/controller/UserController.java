package controller;


import model.dto.UserDto;
import model.service.User;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public List<UserDto> getAllUser() {
        return userService.getAllUser();
    }
    public List<UserDto> addNewUser(User user) {return  userService. addNewByUser(user);}
    public List<UserDto>  deleteUser(Integer id){return userService.deleteByUser(id);
    }
}
