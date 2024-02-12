package io.slowsoon.wasstarterserver.data.repository;

import io.slowsoon.wasstarterserver.data.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
