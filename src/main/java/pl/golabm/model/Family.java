package pl.golabm.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String surname;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "family", cascade = CascadeType.MERGE)
    private List<FamilyMember> familyMembers = new ArrayList<>();

    @OneToMany(mappedBy = "family", cascade = CascadeType.MERGE)
    private List<Child> childList = new ArrayList<>();
    private Date lastPastoralVisit;

    @ManyToOne
    private FamilyMember familyMember;

    @ManyToOne
    private Child child;

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

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public Date getLastPastoralVisit() {
        return lastPastoralVisit;
    }

    public void setLastPastoralVisit(Date lastPastoralVisit) {
        this.lastPastoralVisit = lastPastoralVisit;
    }

    public FamilyMember getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(FamilyMember familyMember) {
        this.familyMember = familyMember;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
