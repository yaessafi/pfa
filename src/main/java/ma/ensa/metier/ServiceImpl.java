package ma.ensa.metier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import ma.ensa.dao.CategorieRepository;
import ma.ensa.dao.OffreRepository;
import ma.ensa.entities.Categorie;
import ma.ensa.entities.Offre;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ServiceImpl implements IService {

	@Autowired
	private OffreRepository offreRepository;
	@Autowired
	private CategorieRepository categorieRepository;
	
	

	

	
//	public boolean suprrimerOffre(Long id) {
//		Offre o = offreRepository.getOne(id);
//		if (o.getCategories().size()== 0)
//		  { offreRepository.deleteById(id);
//			return true; }
//		else
//		 {  o.setCategories(null);
//		 	
//		 	offreRepository.save(o);
//			 offreRepository.deleteById(id); 
//			return true;
//		    }
	
	

	@Override
	public Collection<Offre> getOffrees(Long id) {
		
		Categorie c = categorieRepository.findOne(id);
		return  c.getOffres();
	}






	@Override
	public boolean suprrimerOffre(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
