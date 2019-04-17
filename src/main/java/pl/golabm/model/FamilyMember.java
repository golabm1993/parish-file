package pl.golabm.model;

import java.util.Date;

public class FamilyMember {

    private FamilyMemberType familyMemberType;
    private String firstName;
    private Date dateOfBirth;
    private String occupation;
    private String work;
    private Date yearOfMarriage;
    private SundayHolyMass sundayHolyMass;
    private ConfessionAndHolyCommunion confessionAndHolyCommunion;
    private String comments;

    public FamilyMember() {
    }

    public FamilyMemberType getFamilyMemberType() {
        return familyMemberType;
    }

    public void setFamilyMemberType(FamilyMemberType familyMemberType) {
        this.familyMemberType = familyMemberType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Date getYearOfMarriage() {
        return yearOfMarriage;
    }

    public void setYearOfMarriage(Date yearOfMarriage) {
        this.yearOfMarriage = yearOfMarriage;
    }

    public SundayHolyMass getSundayHolyMass() {
        return sundayHolyMass;
    }

    public void setSundayHolyMass(SundayHolyMass sundayHolyMass) {
        this.sundayHolyMass = sundayHolyMass;
    }

    public ConfessionAndHolyCommunion getConfessionAndHolyCommunion() {
        return confessionAndHolyCommunion;
    }

    public void setConfessionAndHolyCommunion(ConfessionAndHolyCommunion confessionAndHolyCommunion) {
        this.confessionAndHolyCommunion = confessionAndHolyCommunion;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
