package it.cws.coursjpa.web;

import it.cws.coursjpa.dao.EmployeRepository;
import it.cws.coursjpa.entities.Employee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EmployeRestController
{
    private EmployeRepository employeRepository;
    @GetMapping("/index")
    public List<Employee> inedex(){
        return employeRepository.findAll();
    }
}

