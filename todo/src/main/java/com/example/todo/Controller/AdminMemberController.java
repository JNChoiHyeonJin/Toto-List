package com.example.todo.Controller;

import com.example.todo.entity.Member_fake;
import com.example.todo.Service.AdminMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/members")
public class AdminMemberController {

    private final AdminMemberService adminMemberService;

    @Autowired
    public AdminMemberController(AdminMemberService adminMemberService) {
        this.adminMemberService = adminMemberService;
    }

    @GetMapping
    public List<Member_fake> getAllMembers() {
        return adminMemberService.getAllMembers();
    }
    @GetMapping("/{username}")
    public Member_fake getMemberByUsername(@PathVariable String username) {
        return adminMemberService.getMemberByUsername(username);
    }



    @PutMapping("/{memberId}")
    public Member_fake updateMember(@PathVariable Long memberId, @RequestBody Member_fake member) {
        member.setId(memberId);
        return adminMemberService.updateMember(member);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        adminMemberService.deleteMember(memberId);
    }
}