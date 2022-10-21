package com.ndemeyvan.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {


    private Integer id;

    private UtilisateurDto utilisateurDto;

    private String roleName;
}
