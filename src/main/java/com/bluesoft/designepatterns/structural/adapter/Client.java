package com.bluesoft.designepatterns.structural.adapter;

import com.bluesoft.designepatterns.structural.adapter.classimplementation.EmployeeClassAdapter;
import com.bluesoft.designepatterns.structural.adapter.objectimplementation.EmployeeObjectAdapter;

class Client {
    public static void main(String[] args) {
        // --- Class Adapter -------------------------------------
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        // -------------------------------------------------------

        // Object Adapter (preferred implementation)
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Janusz Stolorz");
        employee.setJobTitle("Architect IT");
        employee.setOfficeLocation("Gawronów 22");
    }
}
