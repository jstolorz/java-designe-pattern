package com.bluesoft.designepatterns.structural.adapter.classimplementation;

// Adapter

import com.bluesoft.designepatterns.structural.adapter.Customer;
import com.bluesoft.designepatterns.structural.adapter.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
