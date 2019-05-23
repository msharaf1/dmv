package com.msschool.dmv.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Entity
public class License {
    public static Integer counter = 0;
    
//    public License(String number, String state, Date expirationDate, Person person) {
//        this.number = getNumber();
//        this.state = state;
//        this.expirationDate = expirationDate;
//        this.person = person;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Size(min = 1, max = 255, message = "Must be between 1 and 255")
    private String licenseNumber; 
    @Size(min = 2, max = 255, message = "Must be between 1 and 20")
    private String state;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expirationDate;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    //setters and getters
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCounter(Integer counter){
        this.counter = counter;
      }
      public Integer getCounter(){
        return this.counter;
      }
      
      
      public String getLicenseNumber(){
        return this.licenseNumber;
      }
      public void setLicenseNumber(){
        String nums = "0000";
        String newLNum = nums+""+getCounter().toString();
        this.licenseNumber = newLNum;
      }
      
    //   License ms = new License();
      public License() {
        counter++;
        this.createdAt = new Date();
        this.updatedAt = new Date();
        setLicenseNumber();
        // this.setNumber(counter) = getCounter();
    }


}
