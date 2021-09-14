package com.bluesoft.designepatterns.structural.adapter;

import com.bluesoft.designepatterns.structural.adapter.classimplementation.BusinessCardDesigner;
import com.bluesoft.designepatterns.structural.adapter.classimplementation.Employee;
import com.bluesoft.designepatterns.structural.adapter.classimplementation.EmployeeClassAdapter;

class Client {
    public static void main(String[] args) {
        // --- Class Adapter -------------------------------------
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        // -------------------------------------------------------



    }

    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Janusz Stolorz");
        employee.setJobTitle("Architect IT");
        employee.setOfficeLocation("Gawronów 22");
    }
}
