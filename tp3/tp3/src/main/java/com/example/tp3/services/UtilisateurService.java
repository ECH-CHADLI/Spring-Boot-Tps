package com.example.tp3.services;


import java.util.List;

import com.example.tp3.models.Utilisateur;
import com.example.tp3.models.UtilisateurImage;

public interface UtilisateurService {
    Utilisateur createUtilisateur(Utilisateur utilisateur, Long roleId);
    Utilisateur addImageToUtilisateur(Long utilisateurId, UtilisateurImage image);
    List<Utilisateur> getUtilisateursByRole(Long roleId);
}
