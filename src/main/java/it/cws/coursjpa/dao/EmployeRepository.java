package it.cws.coursjpa.dao;

import it.cws.coursjpa.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employee,Long> {
}
