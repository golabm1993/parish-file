package pl.golabm.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "family")
    @JsonManagedReference
    private List<FamilyMember> familyMembers = new ArrayList<>();

    private Date lastPastoralVisit;

    public Family() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Date getLastPastoralVisit() {
        return lastPastoralVisit;
    }

    public void setLastPastoralVisit(Date lastPastoralVisit) {
        this.lastPastoralVisit = lastPastoralVisit;
    }
}
