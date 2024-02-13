package io.slowsoon.wasstarterserver.service;

import io.slowsoon.wasstarterserver.data.dto.UserDto;
import io.slowsoon.wasstarterserver.data.dto.UserResponseDto;
import io.slowsoon.wasstarterserver.data.repository.UserRepository;

public interface UserService {
    UserResponseDto getUser(Long seq);
    UserResponseDto saveUser(UserDto userDto);
    UserResponseDto changeUserName(Long seq, String name) throws Exception;
    void deleteUser(Long seq) throws Exception;
}
