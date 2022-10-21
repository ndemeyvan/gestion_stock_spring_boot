package com.ndemeyvan.gestiondestock.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.LigneCommandeFournisseur;
import com.ndemeyvan.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneVenteDto {

    private Integer id;

    @JsonIgnore
    private  VentesDto ventesDto;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    /**
     * Cette methode permet de faire un mapping de ligneVente vers LigneVenteDto
     *
     * @param ligneVente
     * @return
     */
    public static LigneVenteDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de ligneVenteDto vers LigneVente
     *
     * @param ligneVenteDto
     * @return
     */
    public static LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        return ligneVente;
    }
}
