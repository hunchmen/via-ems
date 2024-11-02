package com.via.ems.service;

import org.springframework.stereotype.Service;

import com.via.ems.dto.EmployeeDTO;
import com.via.ems.mapper.EmployeeMapper;
import com.via.ems.model.Employee;
import com.via.ems.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }
    
}
