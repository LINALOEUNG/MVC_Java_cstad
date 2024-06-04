package model.service;

import model.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> addNewByUser(User user);

    List<UserDto> deleteByUser(Integer id);

    List<UserDto> getAllUser();
}
