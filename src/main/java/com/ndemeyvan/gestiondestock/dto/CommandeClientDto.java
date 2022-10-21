package com.ndemeyvan.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Category;
import com.ndemeyvan.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    @JsonIgnore
    private ClientDto client;

    @JsonIgnore
    private List<LigneCommandeClientDto> commandeClientDtos;

    /**
     * Cette methode permet de faire un mapping de commandeClient vers commandeClientDto
     *
     * @param commandeClient
     * @return
     */
    public CommandeClientDto fromEntity(CommandeClient commandeClient) {
        if (commandeClient == null) {
            return null;
            // Throw Exeption
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .dateCommande(commandeClient.getDateCommande())
                .code(commandeClient.getCode())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de categoryDto vers category
     *
     * @param commandeClientDto
     * @return
     */
    public CommandeClient toEntity(CommandeClientDto  commandeClientDto) {
        if (commandeClientDto == null) {
            return null;
            // Throw Exeption
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        return commandeClient;
    }
}
