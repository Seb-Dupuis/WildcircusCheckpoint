package fr.portfolio.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    public Project(){

    }

    public Project(String titre, Boolean active, String description, String image, String url){
        this.titre = titre;
        this.active = active;
        this.description = description;
        this.image = image;
        this.url = url;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Long id;
    private String titre;
    public Boolean active;
    public String description;
    public String image;
    public String url;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }




}