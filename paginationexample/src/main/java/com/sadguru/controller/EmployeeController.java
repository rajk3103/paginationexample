package com.sadguru.controller;

import com.sadguru.entity.Employee;
import com.sadguru.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@ResponseBody
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> save (@RequestBody Employee employee){

        return new ResponseEntity<>(employeeService.save(employee), HttpStatus.CREATED);

    }

    @GetMapping("/findall")
    public ResponseEntity <Page<Employee>> findAll(@RequestParam(defaultValue ="0") int page, @RequestParam(defaultValue = "5") int size){

        return new ResponseEntity<> (employeeService.findAll(page, size), HttpStatus.OK);
    }
}
