package com.chestermabulela.school.department.service;

import java.util.List;

import com.chestermabulela.school.department.entity.Department;


public interface DepartmentService {

public Department saveDepartment(Department department);
public List<Department> fetchDepartmentList();
public Department fetchDepartmentById(Long departmentId) throws com.chestermabulela.school.department.error.DepartmentNotFoundException;

public void deleteDepartmentById(Long departmentId);

public Department updateDepartment(Long departmentId, Department department);

Department fetchDepartmentByName(String departmentName);

}
