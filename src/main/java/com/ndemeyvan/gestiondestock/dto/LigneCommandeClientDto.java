package com.ndemeyvan.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Fournisseur;
import com.ndemeyvan.gestiondestock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeClientDto {

    private Integer id;

    @JsonIgnore
    private ArticleDto article;

    @JsonIgnore
    private CommandeClientDto commandeClientDto;

    /**
     * Cette methode permet de faire un mapping de ligneCommandeClient vers FournisseurDto
     *
     * @param ligneCommandeClient
     * @return
     */
    public LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {
        if (ligneCommandeClient == null) {
            return null;
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())

                .build();
    }

    /**
     * Cette methode permet de faire un mapping de ligneCommandeClientDto vers ligneCommandeClient
     *
     * @param ligneCommandeClientDto
     * @return
     */
    public LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
        if (ligneCommandeClientDto == null) {
            return null;
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClient.getId());
        return ligneCommandeClient;
    }

}
