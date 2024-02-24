package io.slowsoon.wasstarterserver.data.dto;

import io.slowsoon.wasstarterserver.data.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResUsers {
    private final Long user_id;
    private final String email;
    private final LocalDateTime created_at;
    private final LocalDateTime updated_at;

    public ResUsers(User user) {
        this.user_id = user.getId();
        this.email = user.getEmail();
        this.created_at = user.getCreatedAt();
        this.updated_at = user.getUpdatedAt();
    }

}
