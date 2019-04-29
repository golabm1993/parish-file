package pl.golabm.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private FamilyMemberType familyMemberType;
    private String firstName;
    private Date birthDate;
    private String occupation;
    private String work;
    private Date yearOfMarriage;
    private SundayHolyMass sundayHolyMass;
    private ConfessionAndHolyCommunion confessionAndHolyCommunion;
    private String comments;

    @ManyToOne
    @JsonBackReference
    private Family family;

    public FamilyMember() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
