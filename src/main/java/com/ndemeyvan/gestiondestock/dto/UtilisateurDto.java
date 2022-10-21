package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Role;
import com.ndemeyvan.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private String dateDeNaissance;

    private String motDePasse;

    @JsonIgnore
    private AdresseDto adresse;

    private String photo;

    @JsonIgnore
    private EntrepriseDto entrepriseDto;

    @JsonIgnore
    private List<RoleDto> roleDtos;

    /**
     * Cette methode permet de faire un mapping de utilisateur vers utilisateurDto
     *
     * @param utilisateur
     * @return
     */
    public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de utilisateurDto vers utilisateur
     *
     * @param utilisateurDto
     * @return
     */
    public static Utilisateur toEntity(UtilisateurDto utilisateurDto) {
        if (utilisateurDto == null) {
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        return utilisateur;
    }


}
