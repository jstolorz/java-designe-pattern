package com.bluesoft.designepatterns.structural.adapter.classimplementation;

// Adaptee class

public class Employee {
    private String fullName;
    private String jobTitle;
    private String officeLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(final String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
