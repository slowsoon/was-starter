package io.slowsoon.wasstarterserver.service.impl;

import io.slowsoon.wasstarterserver.data.dao.UserDAO;
import io.slowsoon.wasstarterserver.data.dto.UserDto;
import io.slowsoon.wasstarterserver.data.dto.UserResponseDto;
import io.slowsoon.wasstarterserver.data.entity.User;
import io.slowsoon.wasstarterserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public UserResponseDto getUser(Long seq) {
        User user = userDAO.selectUser(seq);
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setSeq(user.getSeq());
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setPassword(user.getPassword());
        return null;
    }

    @Override
    public UserResponseDto saveUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserResponseDto changeUserName(Long seq, String name) throws Exception {
        return null;
    }

    @Override
    public void deleteUser(Long seq) throws Exception {

    }
}
