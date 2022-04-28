package com.sunglowsys.domain;

public class A {
    private Long id;

    private String firstName;

    private String lastName;

    private Address obj;

    public A(){}

    public A(Long id, String firstName, String lastName, Address obj) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.obj = obj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getObj() {
        return obj;
    }

    public void setObj(Address obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", obj=" + obj +
                '}';
    }
}
