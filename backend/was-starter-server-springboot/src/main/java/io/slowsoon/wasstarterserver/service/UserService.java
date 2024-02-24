package io.slowsoon.wasstarterserver.service;

import io.slowsoon.wasstarterserver.data.dto.ReqAddUser;
import io.slowsoon.wasstarterserver.data.entity.User;
import io.slowsoon.wasstarterserver.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public User addUser(ReqAddUser req) {
        return userRepository.save(req.toEntity());
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
