package com.ndemeyvan.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {

    private UtilisateurDto utilisateur;

    private String roleName;
}
