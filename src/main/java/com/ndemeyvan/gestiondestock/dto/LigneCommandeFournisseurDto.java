package com.ndemeyvan.gestiondestock.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.LigneCommandeClient;
import com.ndemeyvan.gestiondestock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Integer id;

    @JsonIgnore
    private CommandeFournisseurDto commandeFournisseurDto;

    @JsonIgnore
    private ArticleDto article;

    /**
     * Cette methode permet de faire un mapping de ligneCommandeFournisseur vers LigneCommandeFournisseurDto
     *
     * @param ligneCommandeFournisseur
     * @return
     */
    public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
        if (ligneCommandeFournisseur == null) {
            return null;
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de ligneCommandeFournisseurDto vers LigneCommandeFournisseur
     *
     * @param ligneCommandeFournisseurDto
     * @return
     */
    public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        if (ligneCommandeFournisseurDto == null) {
            return null;
        }
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        return ligneCommandeFournisseur;
    }

}
