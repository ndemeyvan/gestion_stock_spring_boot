package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {

    private String nom;

    private String prenom;

    private String email;

    private String dateDeNaissance;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> Role;
}
