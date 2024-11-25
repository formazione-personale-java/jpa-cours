package it.cws.coursjpa.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @EmbeddedId
    private  Article article;
    private double price;
    private int qtity;
    private Date date;
    @PrePersist
    public void prePersist() {
        this.date= new Date();
    }
}
