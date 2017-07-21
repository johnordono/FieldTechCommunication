package com.spectrum.tech.technician;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Technician implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String location;


    public Technician() {
    }

    public Technician(String id, String firstName, String lastName, String location){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public String getId(){ return id; }
    public String getFirstName(){ return firstName; }
    public String getLastName() { return lastName; }
    public String getLocation() { return location; }

    public void setId(String id){ this.id = id; }
    public void setFirstName(String firstName){this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setLocation(String location) { this.location = location; }
}