package com.nm.examRest.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codeRGB")
    @NotNull(message = "Le code RGB ne peut pas être null")
    @NotBlank(message = "Le code RGB ne peut pas être blanc !")
    private String codeRGB;

    @Column(name = "libelle")
    @NotNull(message = "Le champ libelle ne peut pas être null")
    @NotBlank(message = "Le champ libelle ne peut pas être blanc !")
    private String libelle;
    
    public Color() {}
    
    public Color(@NotNull(message = "Le code RGB ne peut pas être null") @NotBlank(message = "Le code RGB ne peut pas être blanc !") String codeRGB,
			@NotNull(message = "Le champ libelle ne peut pas être null") @NotBlank(message = "Le champ libelle ne peut pas être blanc !") String libelle) {
		this.codeRGB = codeRGB;
		this.libelle = libelle;
	}
    
	public Color(Long id,
			@NotNull(message = "Le code RGB ne peut pas être null") @NotBlank(message = "Le code RGB ne peut pas être blanc !") String codeRGB,
			@NotNull(message = "Le champ libelle ne peut pas être null") @NotBlank(message = "Le champ libelle ne peut pas être blanc !") String libelle) {
		this.id = id;
		this.codeRGB = codeRGB;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeRGB() {
		return codeRGB;
	}

	public void setCodeRGB(String codeRGB) {
		this.codeRGB = codeRGB;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	public boolean equals(Object c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;

        Color color = (Color) c;

        if (id != null ? !id.equals(color.id) : color.id != null) return false;
        if (codeRGB != null ? !codeRGB.equals(color.codeRGB) : color.codeRGB != null) return false;
        return libelle != null ? libelle.equals(color.libelle) : color.libelle == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codeRGB != null ? codeRGB.hashCode() : 0);
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "color{" +
                "id=" + id +
                ", codeRGB='" + codeRGB + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
    
}
