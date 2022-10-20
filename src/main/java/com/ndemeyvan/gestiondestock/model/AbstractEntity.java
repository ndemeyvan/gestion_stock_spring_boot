package com.ndemeyvan.gestiondestock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


/**
 *  @Data dAnnotation de Lombok qui aide a generer le constructeur , les getter et les setters
 * @EntityListeners
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public  class AbstractEntity implements Serializable  {

    @Id
    @GeneratedValue()
    private Integer id ;

    /**
     *  @LastModifiedDate Annotation de la derniere mise a jour sur un champ
     *  @Column ceci sera un champ de notre table
     *  @JsonIgnore Ce champ sera ignorer parmis les reponses du serveur
     *  @CreatedDate Ce champ stipule la date de creation de la ligne dans la table
     */
    @CreatedDate
    @JsonIgnore
    @Column( name = "creationDate", nullable = false)
    private Instant creationDate;

    @LastModifiedDate
    @JsonIgnore
    @Column( name = "lastUpdateDate" )
    private Instant lastUpdateDate;

}
