package ma.ensa.web;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.dao.CategorieRepository;
import ma.ensa.entities.Categorie;
import ma.ensa.entities.Offre;
import ma.ensa.entities.User;
import ma.ensa.metier.IService;

@RestController
@CrossOrigin("*")
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;
	@Autowired
	private IService service;
	
	@RequestMapping("/categories")
	public List<Categorie> getCategories(){
		return categorieRepository.findAll();
	}
	
	@RequestMapping("/categories/{id}")
	public Categorie getOffre(@PathVariable Long id){
		return categorieRepository.findOne(id);
	}
	
	
	
	@RequestMapping("/categorie/{id}")
	public Collection<Offre> rechercherParcategorie(@PathVariable Long id){
		
		return service.getOffrees(id);
	}
	
	
}
