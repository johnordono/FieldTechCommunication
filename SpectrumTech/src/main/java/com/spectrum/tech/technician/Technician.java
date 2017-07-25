package com.spectrum.tech.technician;


import com.spectrum.tech.ticket.Ticket;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


@Entity
public class Technician implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String location;
    private String[] ticketIds;

    public Technician() {
    }

    public Technician(String id, String firstName, String lastName, String location, String[] ticketIds){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.ticketIds = ticketIds;
    }

    public String getId(){ return id; }
    public String getFirstName(){ return firstName; }
    public String getLastName() { return lastName; }
    public String getLocation() { return location; }
    public String[] getTicketIds(){ return ticketIds; }

    public void setId(String id){ this.id = id; }
    public void setFirstName(String firstName){this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setLocation(String location) { this.location = location; }

    public void addTicketId(String ticketId){
        int length = this.ticketIds.length;
        this.ticketIds[length] = ticketId;
    }

    public void removeTicketId(String id){
    }
}