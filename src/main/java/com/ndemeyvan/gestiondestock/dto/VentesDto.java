package com.ndemeyvan.gestiondestock.dto;

import java.time.Instant;

import com.ndemeyvan.gestiondestock.model.Utilisateur;
import com.ndemeyvan.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VentesDto {

    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    /**
     * Cette methode permet de faire un mapping de Ventes vers VentesDto
     *
     * @param ventes
     * @return
     */
    public static VentesDto fromEntity(Ventes ventes) {
        if (ventes == null) {
            return null;
        }
        return VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de ventesDto vers ventes
     *
     * @param ventesDto
     * @return
     */
    public static Ventes toEntity(VentesDto ventesDto) {
        if (ventesDto == null) {
            return null;
        }
        Ventes ventes = new Ventes();
        ventes.setDateVente(ventesDto.getDateVente());
        ventes.setCode(ventesDto.getCode());
        ventes.setCode(ventesDto.getCode());
        ventes.setId(ventesDto.getId());
        return ventes;
    }
}
