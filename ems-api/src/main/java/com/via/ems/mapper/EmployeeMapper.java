package com.via.ems.mapper;

import com.via.ems.dto.EmployeeDTO;
import com.via.ems.model.Employee;

public class EmployeeMapper {
    
    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
        return new EmployeeDTO(
            employee.getId(), 
            employee.getFirstName(), 
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
            employeeDTO.getId(),
            employeeDTO.getFirstName(), 
            employeeDTO.getLastName(), 
            employeeDTO.getEmail()
        );
    }
}
