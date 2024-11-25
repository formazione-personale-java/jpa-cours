package it.cws.coursjpa.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Address {
    private String street;
    private String city;
    private String zipCode;
    private String tel;
    private String continemt;

    // Getters and setters
}
