package sn.isi.entities;

public class Personne {
   private Integer id;
    private String non;
    private String prenom;
   private String email;
   private String String;
   private String etat;

    /* definitions des constructeurs*/

    public Personne(Integer id, java.lang.String non, java.lang.String prenom, java.lang.String email, java.lang.String string, java.lang.String etat) {
        this.id = id;
        this.non = non;
        this.prenom = prenom;
        this.email = email;
        String = string;
        this.etat = etat;
    }

    public Personne() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.lang.String getNon() {
        return non;
    }

    public void setNon(java.lang.String non) {
        this.non = non;
    }

    public java.lang.String getPrenom() {
        return prenom;
    }

    public void setPrenom(java.lang.String prenom) {
        this.prenom = prenom;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getString() {
        return String;
    }

    public void setString(java.lang.String string) {
        String = string;
    }

    public java.lang.String getEtat() {
        return etat;
    }

    public void setEtat(java.lang.String etat) {
        this.etat = etat;
    }
}
