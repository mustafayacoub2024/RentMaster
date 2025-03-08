package org.example.rentmaster.model.db.repository;


import org.example.rentmaster.model.db.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, UUID> {
}
