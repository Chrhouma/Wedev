package com.Tn.WeDev.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    private String id =UUID.randomUUID().toString();
    private String libelle;
    private String entreprise;
    private String resume;
    private Date date_debut;
    private Date date_fin;

}
