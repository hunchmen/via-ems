package com.via.ems.service;

import java.util.List;

import com.via.ems.dto.EmployeeDTO;

public interface EmployeeService {
    
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long id);

    List<EmployeeDTO> getAllEmployee();

    EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployee);

}
