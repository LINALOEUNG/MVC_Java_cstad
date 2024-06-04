package mapper;

import model.dto.UserDto;
import model.service.User;

public class Mapper {
    public static UserDto mapFromUserToUserDto(User user){
        if(user==null){
            return null;
        }
        return new UserDto(user.getName(),user.getEmail());
    }
}
