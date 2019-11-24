package ma.ensa.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.dao.OffreRepository;
import ma.ensa.dao.UserRepository;
import ma.ensa.entities.Offre;
import ma.ensa.entities.User;
import ma.ensa.metier.IService;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@RequestMapping("/users/{id}")
	public Optional<User> getOffre(@PathVariable Long id){
		return userRepository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/users")
	public User save(@RequestBody User u){
		return userRepository.save(u);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/users/{id}")
	public boolean supprimerUser(@PathVariable Long id){
		 userRepository.deleteById(id);
		 return true;
	}
	
	
	
}
