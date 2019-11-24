package ma.ensa.metier;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.query.Param;

import ma.ensa.entities.Offre;

public interface IService {
 
	
	public boolean suprrimerOffre(Long id);
	public Collection<Offre> getOffrees(Long id) ;
}
