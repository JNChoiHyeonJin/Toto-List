package com.example.todo.Service;


import com.example.todo.entity.Member_fake;
import com.example.todo.repository.MemberRepository_fake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminMemberService {

    private final MemberRepository_fake memberRepository;

    @Autowired
    public AdminMemberService(MemberRepository_fake memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member_fake getMemberByUsername(String username) {
        return memberRepository.findByUsername(username);
    }

    public List<Member_fake> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member_fake updateMember(Member_fake member) {
        return memberRepository.save(member);
    }

    public void deleteMember(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}
