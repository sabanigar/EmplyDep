package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Employee;
import employeeRepository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	
	private EmployeeRepository emprepo;
	
	public  Employee saveEmployee(Employee emp)
	{
		return  emprepo.save(emp);
	}
	
  public List<Employee>  getEmployeeByDepartment(Long depId){
	return emprepo.findByDepartmentId(depId);
	  
  }
	

}
