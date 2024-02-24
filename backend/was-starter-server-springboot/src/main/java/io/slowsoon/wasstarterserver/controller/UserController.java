package io.slowsoon.wasstarterserver.controller;

import io.slowsoon.wasstarterserver.data.dto.ReqAddUser;
import io.slowsoon.wasstarterserver.data.dto.ResUsers;
import io.slowsoon.wasstarterserver.data.entity.User;
import io.slowsoon.wasstarterserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/api/user")
    public ResponseEntity<User> addUser(@RequestBody ReqAddUser req) {
        User addedUser = userService.addUser(req);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<ResUsers>> getUsers() {
        List<ResUsers> users = userService.getUsers().stream().map(ResUsers::new).toList();
        return ResponseEntity.ok().body(users);
    }

}
