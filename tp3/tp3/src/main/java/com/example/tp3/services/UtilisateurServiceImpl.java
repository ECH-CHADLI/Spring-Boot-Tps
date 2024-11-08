package com.example.tp3.services;


import java.util.List;


import com.example.tp3.repository.RoleRepository;
import com.example.tp3.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tp3.models.Utilisateur;
import com.example.tp3.models.Role;

import com.example.tp3.models.UtilisateurImage;
import com.example.tp3.repository.UtilisateurImageRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UtilisateurImageRepository utilisateurImageRepository;

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur, Long roleId) {
        Role role = roleRepository.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
        utilisateur.setRole(role);
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur addImageToUtilisateur(Long utilisateurId, UtilisateurImage image) {
        Utilisateur utilisateur = utilisateurRepository.findById(utilisateurId)
                .orElseThrow(() -> new RuntimeException("Utilisateur not found"));
        image.setUtilisateur(utilisateur);
        utilisateur.setImage(image);
        utilisateurImageRepository.save(image);
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> getUtilisateursByRole(Long roleId) {
        return roleRepository.findById(roleId)
                .map(Role::getUtilisateurs)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }
}
