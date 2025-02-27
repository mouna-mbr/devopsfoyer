package com.esprit.tic.twin.springproject.repositories;

import com.esprit.tic.twin.springproject.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Optional<Etudiant> findEtudiantByNomEtAndPrenomEt(String nomEt, String prenomEt);
    Optional<Etudiant> findByCin(long cin);
}
