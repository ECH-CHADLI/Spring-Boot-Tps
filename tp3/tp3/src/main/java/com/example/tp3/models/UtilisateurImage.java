package com.example.tp3.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UtilisateurImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomImage;
    private String cheminImage;

    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
