package com.example.tp3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp3.models.UtilisateurImage;

import java.util.Optional;

public interface UtilisateurImageRepository extends JpaRepository<UtilisateurImage, Long> {
    Optional<UtilisateurImage> findByUtilisateurId(Long utilisateurId);
}
