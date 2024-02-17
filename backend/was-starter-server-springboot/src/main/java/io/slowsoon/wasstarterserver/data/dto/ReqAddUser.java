package io.slowsoon.wasstarterserver.data.dto;

import io.slowsoon.wasstarterserver.data.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ReqAddUser {
    private String email;
    private String password;

    public User toEntity() {
        return User.builder()
                   .email(email)
                   .password(password)
                   .build();
    }
}
