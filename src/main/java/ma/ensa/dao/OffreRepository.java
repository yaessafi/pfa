package ma.ensa.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.ensa.entities.Categorie;
import ma.ensa.entities.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
	
	public Collection<Offre> findByLieu(String lieu);
	public Collection<Offre> findByTypeOffre(String type);
	public Collection<Offre> findByCategories(Categorie categorie);
	
	@Query("select distinct lieu from Offre")
	public Collection<String> villeDistinct();
	
}
