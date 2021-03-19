package sn.isi.entities;

import sn.isi.service.IConsultant;

import java.util.Scanner;

public class IconsultantEMP  implements IConsultant {
    @Override
    public Consultant saisi() {
        Scanner scan =new Scanner(System.in);
        Consultant C=new Consultant();
        System.out.print("entrer l'identifiant du consultant");
        C.setId(Integer.parseInt(scan.nextLine()));
        System.out.print("entrer le nom du consultant ");
        C.setNon(scan.nextLine());
        System.out.print("entrer prenom du consultant");
        C.setPrenom(scan.nextLine());
        System.out.print("entrer l'email du consultant");
        C.setEmail(scan.nextLine());
        System.out.print("entrer l'etat du consultatnt");

        return C;
    }

    @Override
    public void affiche(Consultant C) {
        System.out.print("l'identifiant ddu consultant est :"+C.getId());
        System.out.print("le nom du consultant est :"+C.getNon());
        System.out.print("le prenom de consultant est :"+C.getPrenom());
        System.out.print("l'email du consultant est :"+C.getEmail());
        System.out.print("l'etat du consultant est :"+C.getEtat());

    }
}
