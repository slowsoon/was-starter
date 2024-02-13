package io.slowsoon.wasstarterserver.data.dao;

import io.slowsoon.wasstarterserver.data.entity.User;

public interface UserDAO {
    User insertUser(User user);
    User selectUser(Long seq);
    User updateUserName(Long seq, String name) throws Exception;
    void deleteUser(Long seq) throws Exception;
}
