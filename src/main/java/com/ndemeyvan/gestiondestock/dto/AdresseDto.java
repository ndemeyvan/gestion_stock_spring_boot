package com.ndemeyvan.gestiondestock.dto;

import com.ndemeyvan.gestiondestock.model.Adresse;
import com.ndemeyvan.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;

    /**
     * Cette methode permet de faire un mapping de Adresse vers AdresseDto
     *
     * @param adresse
     * @return
     */
    public AdresseDto fromEntity(Adresse adresse) {
        if (adresse == null) {
            return null;
            // Throw Exeption
        }
        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .ville(adresse.getVille())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de adresseDto vers adresse
     *
     * @param adresseDto
     * @return
     */
    public Adresse toEntity(AdresseDto adresseDto) {
        if (adresseDto == null) {
            return null;
            // Throw Exeption
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
}
