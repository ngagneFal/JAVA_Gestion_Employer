package sn.isi.entities;

import sn.isi.service.IEmploye;
import sn.isi.entities.Employe;

import java.util.Scanner;

public class IEmployeEMP implements IEmploye {


    Scanner scan =new Scanner(System.in);
    @Override
    public Employe saisi() {
            Employe E=new Employe();

            Scanner scan =new Scanner(System.in);
            System.out.print("entrer l'identifiant de l'employer");
            E.setId(Integer.parseInt(scan.nextLine()));
            System.out.print("entrer le nom de l'employer ");
            E.setNon(scan.nextLine());
            System.out.print("entrer prenom de l'employer");
            E.setPrenom(scan.nextLine());
            System.out.print("entrer l'email de l'employer");
            E.setEmail(scan.nextLine());
            System.out.print("entrer l'etat de l'employer");
            E.setEtat(scan.nextLine());
            /*System.out.print("entrer l'id du service");
            E.getService().setId(Integer.parseInt(scan.nextLine()));
            System.out.print("entrer le nom du service");
            E.getService().setNom(scan.nextLine());
*/

        return E;
    }

    @Override
    public void affiche(Employe E) {

        System.out.print("l'identifiant de l'employer est :"+E.getId());
        System.out.print("le nom de l'utilisateur est :"+E.getNon());
        System.out.print("le prenom de l'employer est :"+E.getPrenom());
        System.out.print("l'email de l'employer est :"+E.getEmail());
        System.out.print("l'etat de l'employer est :"+E.getEtat());
        System.out.print("le nom de servce  est :"+E.getService().getNom());
       // System.out.print("le nom de servce  est :"+E.getService().getId());

    }

    }

