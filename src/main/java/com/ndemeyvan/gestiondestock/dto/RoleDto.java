package com.ndemeyvan.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.MvtStk;
import com.ndemeyvan.gestiondestock.model.Role;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {


    private Integer id;

    @JsonIgnore
    private UtilisateurDto utilisateurDto;

    private String roleName;


    /**
     * Cette methode permet de faire un mapping de role vers MvtStkDto
     *
     * @param role
     * @return
     */
    public static RoleDto fromEntity(Role role) {
        if (role == null) {
            return null;
        }
        return RoleDto.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de RoleDto vers role
     *
     * @param roleDto
     * @return
     */
    public static Role toEntity(RoleDto roleDto) {
        if (roleDto == null) {
            return null;
        }
        Role mvtStk = new Role();
        mvtStk.setId(roleDto.getId());
        mvtStk.setRoleName(roleDto.getRoleName());
        return mvtStk;
    }
}
