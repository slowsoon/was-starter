package io.slowsoon.wasstarterserver.data.repository;

import io.slowsoon.wasstarterserver.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
