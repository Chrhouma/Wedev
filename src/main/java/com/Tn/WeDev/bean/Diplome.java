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
@Table(name = "diplome")
public class Diplome {
    @Id
    private String id =UUID.randomUUID().toString();
    private String nom;
    private Date date_obtention;
    private String ecole;
}
