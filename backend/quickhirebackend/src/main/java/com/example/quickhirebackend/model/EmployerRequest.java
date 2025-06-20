package com.example.quickhirebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employerrequest")
public class EmployerRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer erequestid; 
    private String companyname; 
    private Integer profid; 
    @Enumerated(EnumType.STRING)
    private AllTypesEnums.UserRequestType requesttype; 

  
    public Integer getRequestId() {
        return erequestid;
    }

    public void setRequestId(int requestId) {
        this.erequestid = requestId;
    }

    public String getCompanyName() {
        return companyname;
    }

    public void setCompanyName(String companyName) {
        this.companyname = companyName;
    }

    public Integer getProfId() {
        return profid;
    }

    public void setProfId(Integer profId) {
        this.profid = profId;
    }

    public AllTypesEnums.UserRequestType getRequestType() {
        return requesttype;
    }

    public void setRequestType(AllTypesEnums.UserRequestType requestType) {
        this.requesttype = requestType;
    }

   
    @Override
    public String toString() {
        return "EmployerRequest{" +
                "requestId=" + erequestid +
                ", companyName='" + companyname + '\'' +
                ", profId=" + profid +
                ", requestType='" + requesttype + '\'' +
                '}';
    }
}
