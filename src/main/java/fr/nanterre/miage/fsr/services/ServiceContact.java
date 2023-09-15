package fr.nanterre.miage.fsr.services;

import fr.nanterre.miage.fsr.daos.DAOContact;

public class ServiceContact {

    public void createContact( String firstname, String lastname, String email){
        DAOContact daoc = new DAOContact();
        daoc.addContact( firstname, lastname, email);
    }

}
