package tech.elzakaria.beans;

import lombok.Data;

import java.util.Date;

@Data
public class Individu {
    private String idFonctionnel;
    private String nom;
    private String prenom;
    private Date date;
    private String adresse;
}
