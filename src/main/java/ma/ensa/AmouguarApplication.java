package ma.ensa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.ensa.dao.AdminRepository;
import ma.ensa.dao.CategorieRepository;
import ma.ensa.dao.OffreRepository;
import ma.ensa.dao.UserRepository;
import ma.ensa.entities.Admin;
import ma.ensa.entities.Categorie;
import ma.ensa.entities.Offre;
import ma.ensa.entities.User;
import ma.ensa.metier.IService;

@SpringBootApplication
public class AmouguarApplication implements CommandLineRunner {
	@Autowired
	private AdminRepository adminrepository;
	@Autowired
	private OffreRepository offre;
	@Autowired
	private CategorieRepository cate;
	@Autowired
	private UserRepository user;
	@Autowired
	private IService service;
	
	public static void main(String[] args)  {
		 SpringApplication.run(AmouguarApplication.class, args);

	}

	 
	public void run(String... args) throws Exception {
		
//	 Date d = new Date(); Categorie c = new Categorie("designation dessais");
	    //User u = user.getOne((long)10);
	    
	   //System.out.println(u.getNom());
//	    cate.save(cate.getOne((long)33));	
	 
	 
		//offre.deleteById((long) 11);
		  
//		  cate.save(c); User u = new User("mohamed", "haha", "ila", "kila",
//		  "098987897", "essaisdeco,","www.com", "98789768", "1000099", "kkkllkj");
//		 user.save(u);
//		  
//		  Collection<Categorie> col = new ArrayList<Categorie>(); col.add(c); Offre o =
//		  new Offre("objet","descriptiooon", 990099, "lieu", d, d, "delaiExecution",
//		  "emailContact","teleContact", "typeOffre", "cahierDesCharges", u,col);
//		  offre.save(o);
		 
//		
//		  Categorie c = cate.findOne((long) 7); List<Offre> l = (List<Offre>)
//		  c.getOffres(); Iterator<Offre> iterateur = l.iterator();
//		  while(iterateur.hasNext()) {
//		  System.out.println(iterateur.next().getCahierDesCharges()); }
		 
		
//		List<Offre> l = service.getOffrees((long) 9);
//	     Iterator<Offre> iterateur = l.iterator();
//		while(iterateur.hasNext()) {
//		System.out.println(iterateur.next().getCahierDesCharges());
		
	 
	

}
}