package com.example.tp3.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.tp3.models.Utilisateur;
import com.example.tp3.models.UtilisateurImage;
import com.example.tp3.services.UtilisateurService;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur, @RequestParam Long roleId) {
        return utilisateurService.createUtilisateur(utilisateur, roleId);
    }

    @PostMapping("/{utilisateurId}/image")
    public Utilisateur addImageToUtilisateur(@PathVariable Long utilisateurId, @RequestBody UtilisateurImage image) {
        return utilisateurService.addImageToUtilisateur(utilisateurId, image);
    }
  
}
