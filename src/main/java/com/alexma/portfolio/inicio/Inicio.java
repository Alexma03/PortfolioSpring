package com.alexma.portfolio.inicio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Inicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String subtitle;
    public String title;
    public String description;
    public String boton1;
    public String boton2;
    public String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBoton1() {
        return boton1;
    }

    public void setBoton1(String boton1) {
        this.boton1 = boton1;
    }

    public String getBoton2() {
        return boton2;
    }

    public void setBoton2(String boton2) {
        this.boton2 = boton2;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
