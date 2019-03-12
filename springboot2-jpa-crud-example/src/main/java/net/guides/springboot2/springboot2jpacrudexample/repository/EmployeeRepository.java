package net.guides.springboot2.springboot2jpacrudexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
