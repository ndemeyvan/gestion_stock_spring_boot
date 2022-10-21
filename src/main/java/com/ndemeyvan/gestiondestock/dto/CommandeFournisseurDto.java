package com.ndemeyvan.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.CommandeClient;
import com.ndemeyvan.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeFournisseurDto {

    private Integer id;

    @JsonIgnore
    private FournisseurDto fournisseur;

    private String code;

    private Instant dateCommande;

    @JsonIgnore
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurListDtos;

    /**
     * Cette methode permet de faire un mapping de commandeClient vers commandeClientDto
     *
     * @param commandeFournisseur
     * @return
     */
    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
        if (commandeFournisseur == null) {
            return null;
        }
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .dateCommande(commandeFournisseur.getDateCommande())
                .code(commandeFournisseur.getCode())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de commandeFournisseurDto vers commandeFournisseur
     *
     * @param commandeFournisseurDto
     * @return
     */
    public static CommandeFournisseur toEntity(CommandeFournisseurDto  commandeFournisseurDto) {
        if (commandeFournisseurDto == null) {
            return null;
            // Throw Exeption
        }
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
        return commandeFournisseur;
    }

}
