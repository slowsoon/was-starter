package io.slowsoon.wasstarterserver.data.dto;

import io.slowsoon.wasstarterserver.data.entity.User;
import lombok.Getter;

@Getter
public class ReqGetUser {
    private String email;
}
