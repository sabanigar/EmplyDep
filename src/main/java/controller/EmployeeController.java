package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bean.Employee;
import service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService emp;
	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp1){ 
		return emp.saveEmployee(emp1);}
		
	
	@GetMapping("/department/{depId}")
	public List<Employee> getEmployeeByDepartment(@PathVariable Long deptId){
		return emp.getEmployeeByDepartment(deptId);
}
	
}
