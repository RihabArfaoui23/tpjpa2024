package DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur {


    @Id
    @GeneratedValue
    long id;

    String nom;
    String email;

}
