package org.example.models;

import javax.validation.constraints.*;

public class Person {
    private Integer id;
    @NotEmpty(message = "Please, enter your name")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Min(value = 1, message = "You should be greater than 0")
    private int age;
    @NotEmpty(message = "Please, enter your name")
    @Email(message = "Email should be valid")
    private String email;

//Russia, Moscow, 123456
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}",message = "Your address should be in this format:Country, City, Postal Code(6 digits)")
    private String address;

    public Person() {
    }

    public Person(Integer id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
