package com.intiformation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.metier.Categorie;
import com.intiformation.metier.Client;
import com.intiformation.metier.Commande;
import com.intiformation.metier.GestionPanier;
import com.intiformation.metier.Produit;
import com.intiformation.metier.Role;
import com.intiformation.metier.User;

@PersistenceContext	
@Repository //declare un bean du dao dans le conteneur spring
public class BoutiqueDaoImpl implements IBoutiqueDao {
	
	// Recup de l'entity Manager
	@Autowired 
	private EntityManagerFactory emf;
		
	private EntityManager em;
	//= emf.createEntityManager();
	
	/**
	 * setter pour l'injection de spring
	 * @param emf the emf to set
	 */
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Transactional
	@Override
	public Long ajouterCategorie(Categorie c) {
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
    
        em.persist(c);
  
        tx.commit();
       
        em.close();

        return c.getIdCategorie();
	}



	@Transactional
	@Override
	public Categorie getCategorie(Long idCat) {
	    
        //déf d'une requete JPQL
        String requeteJPQL = "SELECT c FROM Categorie c WHERE c.idCategorie=?1";

        //creation de la requete avec JPA 
        Query selectQuery = em.createQuery(requeteJPQL);

        selectQuery.setParameter(1, idCat);
        
        //execution de la requête 
        Categorie c = (Categorie) selectQuery.getSingleResult();

        em.close();
        
        return c;
        
	}

	@Transactional
	@Override
	public void supprimerCategorie(Long idcat) {
		
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Categorie c = em.find(Categorie.class, idcat);
        
        em.remove(c);
  
        tx.commit();
		
	}

	@Transactional
	@Override
	public void modifierCategorie(Categorie c) {
	            
	    EntityTransaction tx = em.getTransaction();
	            
	    tx.begin();
	        
	    em.merge(c);
	      
	    tx.commit();
	           
	    em.close();
		
	}
	
	@Transactional
	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		
		EntityTransaction tx = em.getTransaction();
        
        tx.begin();
    
        //manque intantier idCat dans produit
        em.persist(p);
  
        tx.commit();
       
        em.close();
        
        return p.getIdProduit();
	}

	@Transactional
	@Override
	public Produit getProduit(Long idP) {
	    
        //déf d'une requete JPQL
        String requeteJPQL = "SELECT p FROM Produit p WHERE p.idProduit=?1";

        //creation de la requete avec JPA 
        Query selectQuery = em.createQuery(requeteJPQL);

        selectQuery.setParameter(1, idP);
        
        //execution de la requête 
        Produit p = (Produit) selectQuery.getSingleResult();

        em.close();
        
        return p;
	}

	@Transactional
	@Override
	public void supprimerProduit(Long idP) {
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Produit p = em.find(Produit.class, idP);
        
        em.remove(p);
  
        tx.commit();
		
	}

	@Transactional
	@Override
	public void modifierProduit(Produit p) {
        
	    EntityTransaction tx = em.getTransaction();
	            
	    tx.begin();
	        
	    em.merge(p);
	      
	    tx.commit();
	           
	    em.close();
		
	}

	@Transactional
	@Override
	public void ajouterUser(User u) {
		
		EntityTransaction tx = em.getTransaction();
        
        tx.begin();
    
        //manque intantier idCat dans produit
        em.persist(u);
  
        tx.commit();
       
        em.close();
		
	}

	@Transactional
	@Override
	public List<Categorie> listCategories() {
		
		List<Categorie> listCat = em.createQuery("SELECT c FROM Categorie c").getResultList();
		em.close();
		return listCat;
		
	}

	@Transactional
	@Override
	public List<Produit> listproduits() {
		
		List<Produit> listProd = em.createQuery("SELECT p FROM Produit p").getResultList();
		em.close();
		return listProd;
		
	}

	@Transactional
	@Override
	public List<Produit> produitsParMotCle(String mc) {

		//déf d'une requete JPQL
        String requeteJPQL = "SELECT p FROM Produit p WHERE p.designation=?1";

        //creation de la requete avec JPA 
        Query selectQuery = em.createQuery(requeteJPQL);

        selectQuery.setParameter(1, mc);
        
        //execution de la requête 
        List<Produit> listProdMC = selectQuery.getResultList();
        
		em.close();
		
		return listProdMC;
		
	}

	@Transactional
	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		
		//déf d'une requete JPQL
		//A changer
        String requeteJPQL = "SELECT p FROM Produit p WHERE p.idCategorie=?1";

        //creation de la requete avec JPA 
        Query selectQuery = em.createQuery(requeteJPQL);

        selectQuery.setParameter(1, idCat);
        
        //execution de la requête 
        List<Produit> listProdidCat = selectQuery.getResultList();
        
		em.close();
		
		return listProdidCat;
		
	}

	
	@Transactional
	@Override
	public List<Produit> produitsSelectionnes() {
		
		List<Produit> listProdSelect = em.createQuery("SELECT p FROM Produit p WHERE p.selectionne=true").getResultList();
		em.close();
		return listProdSelect ;
		
	}

	@Transactional
	@Override
	public void attribuerRole(Role r, Long userID) {
		
		//déf d'une requete JPQL
        String requeteJPQL = "SELECT u FROM User u WHERE u.idUser=?1";

        //creation de la requete avec JPA 
        Query selectQuery = em.createQuery(requeteJPQL);

        selectQuery.setParameter(1, userID);
        
        //execution de la requête 
        User u = (User) selectQuery.getSingleResult();

        u.setRole(r);
        
        EntityTransaction tx = em.getTransaction();
        
	    tx.begin();
	        
	    em.merge(u);
	      
	    tx.commit();
	    
        em.close();		
		
	}

	@Transactional
	@Override
	public Commande enregistrerCommande(GestionPanier p, Client c) {
		
		return null;
	}

}
