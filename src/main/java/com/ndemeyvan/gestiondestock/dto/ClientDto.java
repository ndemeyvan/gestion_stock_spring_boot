package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Category;
import com.ndemeyvan.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDto {

    private Integer id;
    
    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numeroTelephone;

    @JsonIgnore
    private List<CommandeClientDto> commandeClientDto;


    /**
     * Cette methode permet de faire un mapping de Client vers ClientDto
     *
     * @param client
     * @return
     */
    public ClientDto fromEntity(Client client) {
        if (client == null) {
            return null;
            // Throw Exeption
        }
        return ClientDto.builder()
                .id(client.getId())
                .numeroTelephone(client.getNumeroTelephone())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .email(client.getEmail())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de ClientDto vers Client
     *
     * @param clientDto
     * @return
     */
    public Client toEntity(ClientDto clientDto) {
        if (clientDto == null) {
            return null;
            // Throw Exeption
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setEmail(client.getEmail());
        client.setPhoto(clientDto.getPhoto());
        client.setNumeroTelephone(clientDto.getNumeroTelephone());
        return client;
    }


}
