package com.spectrum.tech.technician;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Ticket implements Serializable{

    @Id
    private String id;
    private String clientName;
    private String clientAddress;
    private String clientPhone;
    private String visitTime;
    private String status;
    private String priority;
    private String problemType;

    public Ticket(){
    }

    public Ticket(String id, String clientName, String clientAddress, String clientPhone, String visitTime,
                    String status, String priority, String problemType){
        this.id = id;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.visitTime = visitTime;
        this.status = status;
        this.priority = priority;
        this.problemType = problemType;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public String getClientAddress() { return clientAddress; }
    public void setClientAddress(String clientAddress) { this.clientAddress = clientAddress; }

    public String getClientPhone() { return clientPhone; }
    public void setClientPhone(String clientPhone) { this.clientPhone = clientPhone; }

    public String getVisitTime() { return visitTime; }
    public void setVisitTime(String visitTime) { this.visitTime = visitTime; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public String getProblemType() { return problemType; }
    public void setProblemType(String problemType) { this.problemType = problemType; }

}
