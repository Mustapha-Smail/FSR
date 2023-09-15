package fr.nanterre.miage.fsr.daos;

import fr.nanterre.miage.fsr.entities.Address;
import fr.nanterre.miage.fsr.entities.Contact;
import fr.nanterre.miage.fsr.entities.ContactGroup;
import fr.nanterre.miage.fsr.entities.PhoneNumber;
import fr.nanterre.miage.fsr.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAOGroupContact implements IDAOGroupContact{

    @Override
    public boolean addGroupContact(String groupName) {

        //Avant l'utilisation de classe JpaUtil
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("projetJPA");

        //1: obtenir une connexion et un EntityManager, en passant par la classe JpaUtil

        boolean success=false;

        try {
            EntityManager em= JpaUtil.getEmf().createEntityManager();

            // 2 : Ouverture transaction
            EntityTransaction tx =  em.getTransaction();
            tx.begin();

            // 3 : Instanciation Objet(s) m�tier (s)
            ContactGroup contactGroup = new ContactGroup(groupName);

            // 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
            em.persist(contactGroup);

            // 5 : Fermeture transaction
            tx.commit();

            // 6 : Fermeture de l'EntityManager et de unit� de travail JPA
            em.close();

            // 7: Attention important, cette action ne doit s'executer qu'une seule fois et non pas à chaque instantiation du ContactDAO
            //Donc, pense bien à ce qu'elle soit la dernière action de votre application
            //JpaUtil.close();

            success=true;
        }
        catch (Exception e) {
            e.printStackTrace();

        }
        return success;

    }
}
