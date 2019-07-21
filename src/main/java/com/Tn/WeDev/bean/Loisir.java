package com.Tn.WeDev.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Getter
@Setter
@Entity
@Table(name = "experience")
public class Loisir {
    @Id
    private String id =UUID.randomUUID().toString();
    private String libelle;

}
