package pl.golabm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Family {

    private String surname;
    private String address;
    private String phoneNumber;
    private List<FamilyMember> familyMembers = new ArrayList<>();
    private List<Child> childList = new ArrayList<>();
    private Date lastPastoralVisit;

    public Family() {
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
}
