package test.springangularapp.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;
import test.springangularapp.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Transactional
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
