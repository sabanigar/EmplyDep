package employeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long departmentId);
}
