package com.spectrum.tech.technician;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Technician implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String location;
    private List<Ticket> assignedTickets = new ArrayList<>();


    public Technician() {
    }

    public Technician(String id, String firstName, String lastName, String location, List<Ticket> tickets){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.assignedTickets = tickets;
    }

    public String getId(){ return id; }
    public String getFirstName(){ return firstName; }
    public String getLastName() { return lastName; }
    public String getLocation() { return location; }
    public List<Ticket> getAssignedTickets() { return assignedTickets; }

    public void setId(String id){ this.id = id; }
    public void setFirstName(String firstName){this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setLocation(String location) { this.location = location; }
    public void addAssignedTicket
}