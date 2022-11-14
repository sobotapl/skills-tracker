package pl.sobota.skillstracker.service;

import org.springframework.transaction.annotation.Transactional;
import pl.sobota.skillstracker.dto.UserDto;
import pl.sobota.skillstracker.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}