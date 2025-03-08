package org.example.rentmaster.model.db.repository;

import org.example.rentmaster.model.db.entity.Technique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechniqueRepository extends JpaRepository<Technique, String> {
}
