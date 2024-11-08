package com.example.tp3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp3.models.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByNom(String nom);
}
