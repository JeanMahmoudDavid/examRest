package com.nm.examRest.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marque")
    @NotNull(message = "Le champ marque ne peut pas être null")
    @NotBlank(message = "Le champ ne peut pas être blanc !")
    private String marque;

    @Column(name = "modele")
    @NotNull(message = "Le champ modèle ne peut pas être null")
    @NotBlank(message = "Le champ ne peut pas être blanc !")
    private String modele;

    @Column(name = "carburant")
    @NotNull(message = "Veuillez saisir une carburant")
    @NotBlank(message = "Le carburant ne peut pas être blanc !")
    private String carburant;

    @Column(name = "description")
    @NotNull(message = "Veuillez saisir une description")
    @NotBlank(message = "Le champ description ne peut pas être blanc !")
    private String description;

    @Column(name = "annee")
    @NotNull(message = "Veuillez saisir une Année")
    private Integer annee;
    
    @Column(name = "kilometrage")
    @NotNull(message = "Veuillez saisir un Kilométrage")
    private Integer kilometrage;
    
    @Column(name = "prix")
    @NotNull(message = "Veuillez saisir un prix")
    private Integer prix;
    
    public Car() {}

    public Car(@NotNull(message = "Le champ marque ne peut pas être null") @NotBlank(message = "Le champ ne peut pas être blanc !") String marque,
			@NotNull(message = "Le champ modèle ne peut pas être null") @NotBlank(message = "Le champ ne peut pas être blanc !") String modele,
			@NotNull(message = "Veuillez saisir une carburant") @NotBlank(message = "Le carburant ne peut pas être blanc !") String carburant,
			@NotNull(message = "Veuillez saisir une description") @NotBlank(message = "Le champ description ne peut pas être blanc !") String description,
			@NotNull(message = "Veuillez saisir une Année") Integer annee,
			@NotNull(message = "Veuillez saisir un Kilométrage")  Integer kilometrage,
			@NotNull(message = "Veuillez saisir un prix") Integer prix) {

		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.description = description;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
	}
    
    public Car(Long id,
			@NotNull(message = "Le champ marque ne peut pas être null") @NotBlank(message = "Le champ ne peut pas être blanc !") String marque,
			@NotNull(message = "Le champ modèle ne peut pas être null") @NotBlank(message = "Le champ ne peut pas être blanc !") String modele,
			@NotNull(message = "Veuillez saisir une carburant") @NotBlank(message = "Le carburant ne peut pas être blanc !") String carburant,
			@NotNull(message = "Veuillez saisir une description") @NotBlank(message = "Le champ description ne peut pas être blanc !") String description,
			@NotNull(message = "Veuillez saisir une Année") @NotBlank(message = "Veuillez saisir une Année") Integer annee,
			@NotNull(message = "Veuillez saisir un Kilométrage") @NotBlank(message = "Veuillez saisir un Kilométrage") Integer kilometrage,
			@NotNull(message = "Veuillez saisir un prix") @NotBlank(message = "Veuillez saisir un prix") Integer prix) {

		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.description = description;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
	}

	@Override
    public boolean equals(Object c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;

        Car car = (Car) c;

        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (marque != null ? !marque.equals(car.marque) : car.marque != null) return false;
        if (modele != null ? !modele.equals(car.modele) : car.modele != null) return false;
        if (carburant != null ? !carburant.equals(car.carburant) : car.carburant != null) return false;
        if (description != null ? !description.equals(car.description) : car.description != null) return false;
        if (annee != null ? !annee.equals(car.annee) : car.annee != null) return false;
        if (kilometrage != null ? !kilometrage.equals(car.kilometrage) : car.kilometrage != null) return false;
        return prix != null ? prix.equals(car.prix) : car.prix == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (marque != null ? marque.hashCode() : 0);
        result = 31 * result + (modele != null ? modele.hashCode() : 0);
        result = 31 * result + (carburant != null ? carburant.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (annee != null ? modele.hashCode() : 0);
        result = 31 * result + (kilometrage != null ? modele.hashCode() : 0);
        result = 31 * result + (prix != null ? modele.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", carburant='" + carburant + '\'' +
                ", description='" + description + '\'' +
                ", annee='" + annee + '\'' +
                ", kilometrage='" + kilometrage + '\'' +
                ", prix='" + prix + '\'' +
                '}';
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Integer getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(Integer kilometrage) {
		this.kilometrage = kilometrage;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}
}
