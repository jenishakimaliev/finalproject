package kg.mega.finalproject.mapper;

import kg.mega.finalproject.moldels.Dto.UserDto;
import kg.mega.finalproject.moldels.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userToUserDto(User user);
    @InheritInverseConfiguration
    User userDtoToUser(UserDto userDto);
}
