package com.csi.repository;

import com.csi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Custom methods

    Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);


}
