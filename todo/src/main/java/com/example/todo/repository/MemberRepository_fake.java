package com.example.todo.repository;

import com.example.todo.entity.Member_fake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository_fake extends JpaRepository<Member_fake, Long> {
    Member_fake findByUsername(String username);
}

