package com.Tn.WeDev.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name="profile")
public class Profile {
    @Id
    private String id =UUID.randomUUID().toString();
    private String nom;
    private String prenom;
    private String image;
    private long telephone;
    private String email;
    private Date date_naissance;
    private String adresse;
    private String nationalite;
    private String profession;
    private String linkedin;

    private List <Diplome> diplomes;
    private List <Experience> experiences;
    private List <Competence> competences;
    private List<Loisir>loisirs;

}
