package ma.ensa.web;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ma.ensa.dao.AdminRepository;
import ma.ensa.dao.CategorieRepository;
import ma.ensa.dao.OffreRepository;
import ma.ensa.entities.Admin;
import ma.ensa.entities.Categorie;
import ma.ensa.entities.Offre;
import ma.ensa.metier.ServiceImpl;

@RestController
@CrossOrigin("*")
public class OffreController {
	@Autowired
	private OffreRepository offreRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	@Autowired
	private ServiceImpl serviceImpl;
	
	
	@RequestMapping(value="/offres",method=RequestMethod.GET)
	public List<Offre> getOffres(){
		System.out.println("hhhhh");
		return offreRepository.findAll();
	}
	
	@RequestMapping("/offres/{id}")
	public Optional<Offre> getOffre(@PathVariable Long id){
		return offreRepository.findById(id);
	}
	
	@PostMapping(value ="/offres" , consumes={"application/json"})
	public Offre save(@RequestBody Offre o){
		
		return offreRepository.save(o);
	}
	@Transactional
	@RequestMapping(method = RequestMethod.DELETE,value = "/offres/{id}")
	public boolean supprimerOffre(@PathVariable Long id){
		 offreRepository.deleteById(id);
		 return true ;
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/offres/{id}")
	public Offre save(@PathVariable Long id , @RequestBody Offre o ){
		o.setIdOffre(id); 
		return offreRepository.save(o);
		
	}
	
	@GetMapping("/offres/ville/{ville}")
	public Collection<Offre> trieParVille(@PathVariable String ville ){
		return offreRepository.findByLieu(ville);
	
	}
	
	@GetMapping("/offres/categories/{categorie}")
	public Collection<Offre> trieParCategorie(@PathVariable String categorie ){
		Categorie c = categorieRepository.findByDesignation(categorie);
		return offreRepository.findByCategories(c);
	
	}
	
	@GetMapping("/offres/type/{type}")
	public Collection<Offre> trieParTypeOffre(@PathVariable String type ){
		return offreRepository.findByTypeOffre(type);
		}
	
	@GetMapping("/offres/villes")
	public Collection<String> getDistinctVilles(){
		return offreRepository.villeDistinct();
		}

}
	

