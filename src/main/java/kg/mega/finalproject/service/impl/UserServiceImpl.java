package kg.mega.finalproject.service.impl;

import kg.mega.finalproject.mapper.UserMapper;
import kg.mega.finalproject.moldels.Dto.UserDto;
import kg.mega.finalproject.moldels.User;
import kg.mega.finalproject.repo.UserRepo;
import kg.mega.finalproject.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = userRepo.save(user);
        return userDto;
    }
}
