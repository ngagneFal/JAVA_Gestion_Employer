package sn.isi.entities;

public class Employe  extends Personne {
    private Service service;
    // conctructor ith argument


    public Employe(Integer id, java.lang.String non, java.lang.String prenom, java.lang.String email, java.lang.String string, java.lang.String etat, Service service) {
        super(id, non, prenom, email, string, etat);
        this.service = service;
    }

    public Employe() {
        super();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
