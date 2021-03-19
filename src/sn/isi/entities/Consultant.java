package sn.isi.entities;

public class Consultant extends Personne{
    Integer nbheure;
    Double tauxHoraire;

    /* definitions des constructeurs*/

    public Consultant(Integer id, java.lang.String non, java.lang.String prenom, java.lang.String email, java.lang.String string, java.lang.String etat, Integer nbheure, Double tauxHoraire) {
        super(id, non, prenom, email, string, etat);
        this.nbheure = nbheure;
        this.tauxHoraire = tauxHoraire;
    }

    public Consultant() {

    }

    public Integer getNbheure() {
        return nbheure;
    }

    public void setNbheure(Integer nbheure) {
        this.nbheure = nbheure;
    }

    public Double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(Double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
