package DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Discussion {


    @Id
    @GeneratedValue
    long id;
}
