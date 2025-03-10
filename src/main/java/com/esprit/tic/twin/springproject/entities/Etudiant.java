package com.esprit.tic.twin.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private TypeEtudiant typeEtudiant;
    @ManyToMany
    @JsonIgnore
    private Set<Reservation> reservations;
    @OneToMany(mappedBy = "etudiantOrdinaire",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Tache> taches;
    private float montantInscription=500;
}
