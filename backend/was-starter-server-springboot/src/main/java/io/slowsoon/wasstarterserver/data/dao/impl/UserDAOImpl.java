package io.slowsoon.wasstarterserver.data.dao.impl;

import io.slowsoon.wasstarterserver.data.dao.UserDAO;
import io.slowsoon.wasstarterserver.data.entity.User;
import io.slowsoon.wasstarterserver.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class UserDAOImpl implements UserDAO {
    private final UserRepository userRepository;

    @Autowired
    public UserDAOImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insertUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User selectUser(Long seq) {
        User selectedUser = userRepository.getById(seq);
        return selectedUser;
    }

    @Override
    public User updateUserName(Long seq, String name) throws Exception {
        Optional<User> selectedUser = userRepository.findById(seq);

        User updatedUser;
        if (selectedUser.isPresent()) {
            User user = selectedUser.get();
            user.setName(name);
            user.setUpdatedAt(LocalDateTime.now());

            updatedUser = userRepository.save(user);
        }
        else {
            throw new Exception();
        }

        return updatedUser;
    }

    @Override
    public void deleteUser(Long seq) throws Exception {

    }
}
