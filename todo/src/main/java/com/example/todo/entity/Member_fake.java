package com.example.todo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Member_fake {

    @OneToMany
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    public void setId(Long memberId) {
    }

    // Getters, setters, constructors, etc.
}
