package ma.ensa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.ensa.entities.Categorie;
import ma.ensa.entities.Offre;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
	@Query("select c from Categorie c where c.idCategorie like :x")
	public Categorie findOne(@Param("x")Long id); 
	
	

	
	  @Query("select o from Offre o  where o.categories like :x ") 
	  public List<Offre> getOffres(@Param("x")Long id) ;
	 
	  public Categorie findByDesignation(String des);
	
	
}

