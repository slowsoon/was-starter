package io.slowsoon.wasstarterserver;

import io.slowsoon.wasstarterserver.data.entity.Member;
import io.slowsoon.wasstarterserver.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
