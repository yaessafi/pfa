package ma.ensa.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUser;
	private String email;
	private String password;
	private String nom;
	private String prenom;
	private String tel;
	private String adress;
	private String siteWeb;
	private String fax;
	private String capital;
	private String photo;
	@OneToMany(mappedBy="proprietaire" , cascade = CascadeType.ALL)
	@JsonBackReference
	private Collection<Offre> offres;
	public User(Long idUser, String email, String password, String nom, String prenom, String tel, String adress,
			String siteWeb, String fax, String capital, String photo) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adress = adress;
		this.siteWeb = siteWeb;
		this.fax = fax;
		this.capital = capital;
		this.photo = photo;
	}
	public User(String email, String password, String nom, String prenom, String tel, String adress, String siteWeb,
			String fax, String capital, String photo, Collection<Offre> offres) {
		super();
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adress = adress;
		this.siteWeb = siteWeb;
		this.fax = fax;
		this.capital = capital;
		this.photo = photo;
		this.offres = offres;
	}
	public User() {
		super();
	}
	public Long getIdUser() {  
		return idUser;
	}
	public User(String email, String password, String nom, String prenom, String tel, String adress, String siteWeb,
			String fax, String capital, String photo) {
		super();
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adress = adress;
		this.siteWeb = siteWeb;
		this.fax = fax;
		this.capital = capital;
		this.photo = photo;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSiteWeb() {
		return siteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Collection<Offre> getOffres() {
		return offres;
	}
	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
	

}
