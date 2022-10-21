package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.CommandeFournisseur;
import com.ndemeyvan.gestiondestock.model.Entreprise;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntrepriseDto {
    
    private Integer id;

    private String nom;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurDtos;

    /**
     * Cette methode permet de faire un mapping de entreprise vers entrepriseDto
     *
     * @param entreprise
     * @return
     */
    public EntrepriseDto fromEntity(Entreprise entreprise) {
        if (entreprise == null) {
            return null;
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de entrepriseDto vers entreprise
     *
     * @param entrepriseDto
     * @return
     */
    public Entreprise toEntity(EntrepriseDto  entrepriseDto) {
        if (entrepriseDto == null) {
            return null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        return entreprise;
    }

}
