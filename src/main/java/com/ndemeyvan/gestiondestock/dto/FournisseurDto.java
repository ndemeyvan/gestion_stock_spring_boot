package com.ndemeyvan.gestiondestock.dto;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Entreprise;
import com.ndemeyvan.gestiondestock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    @JsonIgnore
    private AdresseDto adresseDto;

    private String photo;

    private String email;

    private String numeroTelephone;

    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseursDtos;


    /**
     * Cette methode permet de faire un mapping de Fournisseur vers FournisseurDto
     *
     * @param fournisseur
     * @return
     */
    public FournisseurDto fromEntity(Fournisseur fournisseur) {
        if (fournisseur == null) {
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .numeroTelephone(fournisseur.getNumeroTelephone())
                .photo(fournisseur.getPhoto())
                .email(fournisseur.getEmail())
                .prenom(fournisseur.getPrenom())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de fournisseurDto vers fournisseur
     *
     * @param fournisseurDto
     * @return
     */
    public Fournisseur toEntity(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;
        }
        Fournisseur fournisseur = new Fournisseur();

        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setEmail(fournisseurDto.getEmail());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setNumeroTelephone(fournisseurDto.getNumeroTelephone());
        return fournisseur;
    }

}
