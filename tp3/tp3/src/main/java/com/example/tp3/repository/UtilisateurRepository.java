package com.example.tp3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp3.models.Utilisateur;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByEmail(String email);
}
