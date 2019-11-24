package ma.ensa.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "idCategorie")
@Entity
public class Categorie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategorie;
	private String designation;
	@ManyToMany(mappedBy="categories", fetch = FetchType.EAGER )
	
	@JsonBackReference
	private Collection<Offre> offres;
	
	public Categorie(String designation) {
		super();
		this.designation = designation;
	}
	public Categorie(String designation, Collection<Offre> offres) {
		super();
		this.designation = designation;
		this.offres = offres;
	}
	public Categorie() {
		super();
	}
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Collection<Offre> getOffres() {
		return offres;
	}
	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
	
	
	
}
