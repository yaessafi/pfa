package ma.ensa.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "idOffre")
@Entity
public class Offre implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idOffre;
	private String objet;
	private String description;
	private double montant;
	private String lieu;
	@Temporal(TemporalType.DATE)
	private Date dateDepot;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private String delaiExecution;
	private String emailContact;
	private String teleContact;
	private String typeOffre;
	private String cahierDesCharges;
	@ManyToOne
	@JoinColumn(name="code_User")
	
	private User proprietaire;
	public Offre(String objet, String description, double montant, String lieu, Date dateDepot, Date dateDebut,
			String delaiExecution, String emailContact, String teleContact, String typeOffre, String cahierDesCharges,
			User proprietaire) {
		super();
		this.objet = objet;
		this.description = description;
		this.montant = montant;
		this.lieu = lieu;
		this.dateDepot = dateDepot;
		this.dateDebut = dateDebut;
		this.delaiExecution = delaiExecution;
		this.emailContact = emailContact;
		this.teleContact = teleContact;
		this.typeOffre = typeOffre;
		this.cahierDesCharges = cahierDesCharges;
		this.proprietaire = proprietaire;
	}
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name="Categorie_Offre",joinColumns=@JoinColumn(name="idOffre"),inverseJoinColumns=@JoinColumn(name="idCategorie") )
	
	private Collection<Categorie> categories;
	public Offre(String objet, String description, double montant, String lieu, Date dateDepot, Date dateDebut,
			String delaiExecution, String emailContact, String teleContact, String typeOffre, String cahierDesCharges,
			User proprietaire, Collection<Categorie> categories) {
		super();
		this.objet = objet;
		this.description = description;
		this.montant = montant;
		this.lieu = lieu;
		this.dateDepot = dateDepot;
		this.dateDebut = dateDebut;
		this.delaiExecution = delaiExecution;
		this.emailContact = emailContact;
		this.teleContact = teleContact;
		this.typeOffre = typeOffre;
		this.cahierDesCharges = cahierDesCharges;
		this.proprietaire = proprietaire;
		this.categories = categories;
	}
	public Offre(String objet, String description, double montant, String lieu, Date dateDepot, Date dateDebut,
			String delaiExecution, String emailContact, String teleContact, String typeOffre, String cahierDesCharges,
			User proprietaire, Categorie categories) {
		super();
		this.objet = objet;
		this.description = description;
		this.montant = montant;
		this.lieu = lieu;
		this.dateDepot = dateDepot;
		this.dateDebut = dateDebut;
		this.delaiExecution = delaiExecution;
		this.emailContact = emailContact;
		this.teleContact = teleContact;
		this.typeOffre = typeOffre;
		this.cahierDesCharges = cahierDesCharges;
		this.proprietaire = proprietaire;
		this.categories.add(categories) ;
	}
	public Offre() {
		super();
	}
	public Long getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Date getDateDepot() {
		return dateDepot;
	}
	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDelaiExecution() {
		return delaiExecution;
	}
	public void setDelaiExecution(String delaiExecution) {
		this.delaiExecution = delaiExecution;
	}
	public String getEmailContact() {
		return emailContact;
	}
	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}
	public String getTeleContact() {
		return teleContact;
	}
	public void setTeleContact(String teleContact) {
		this.teleContact = teleContact;
	}
	public String getTypeOffre() {
		return typeOffre;
	}
	public void setTypeOffre(String typeOffre) {
		this.typeOffre = typeOffre;
	}
	public String getCahierDesCharges() {
		return cahierDesCharges;
	}
	public void setCahierDesCharges(String cahierDesCharges) {
		this.cahierDesCharges = cahierDesCharges;
	}
	public User getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(User proprietaire) {
		this.proprietaire = proprietaire;
	}
	public Collection<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Categorie> categories) {
		this.categories = categories;
	}

	
	
	
	
}
