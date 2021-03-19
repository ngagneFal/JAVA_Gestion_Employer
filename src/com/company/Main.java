package com.company;

import sn.isi.entities.Employe;
import sn.isi.entities.IEmployeEMP;
import sn.isi.service.IEmploye;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IEmploye IE=new IEmployeEMP();
        Employe E=IE.saisi();
        IE.affiche(E);
    }
}
