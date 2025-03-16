package org.example.rentmaster.model.db.repository;

import org.example.rentmaster.model.db.entity.Drivers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Driver;

@Repository
public interface DriversRepository extends JpaRepository<Drivers, Long> {
}
