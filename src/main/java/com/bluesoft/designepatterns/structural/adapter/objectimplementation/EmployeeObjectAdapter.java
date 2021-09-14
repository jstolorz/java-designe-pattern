package com.bluesoft.designepatterns.structural.adapter.objectimplementation;

// Object Adapter

import com.bluesoft.designepatterns.structural.adapter.Customer;
import com.bluesoft.designepatterns.structural.adapter.Employee;

public class EmployeeObjectAdapter implements Customer {

    private final Employee employee;

    public EmployeeObjectAdapter(final Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
