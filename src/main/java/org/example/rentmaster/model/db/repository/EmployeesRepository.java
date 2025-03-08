package org.example.rentmaster.model.db.repository;

import org.example.rentmaster.model.db.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, String> {
}
