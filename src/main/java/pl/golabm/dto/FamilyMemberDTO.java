package pl.golabm.dto;

import org.springframework.lang.NonNull;
import pl.golabm.model.ConfessionAndHolyCommunion;
import pl.golabm.model.FamilyMember;
import pl.golabm.model.FamilyMemberType;
import pl.golabm.model.SundayHolyMass;

import java.util.Date;

public class FamilyMemberDTO {

    private Long id;

    @NonNull
    private FamilyMemberType familyMemberType;

    @NonNull
    private String firstName;

    @NonNull
    private Date birthDate;

    private String occupation;
    private String work;
    private Date yearOfMarriage;
    private SundayHolyMass sundayHolyMass;
    private ConfessionAndHolyCommunion confessionAndHolyCommunion;
    private String comments;

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

    public FamilyMember toEntity() {
        final FamilyMember familyMember = new FamilyMember();
        familyMember.setId(id);
        familyMember.setFamilyMemberType(familyMemberType);
        familyMember.setFirstName(firstName);
        familyMember.setBirthDate(birthDate);
        familyMember.setOccupation(occupation);
        familyMember.setWork(work);
        familyMember.setYearOfMarriage(yearOfMarriage);
        familyMember.setSundayHolyMass(sundayHolyMass);
        familyMember.setConfessionAndHolyCommunion(confessionAndHolyCommunion);
        familyMember.setComments(comments);
        return familyMember;
    }

    public static FamilyMemberDTO fromEntity(final FamilyMember familyMember) {
        final FamilyMemberDTO familyMemberDTO = new FamilyMemberDTO();
        familyMemberDTO.setId(familyMember.getId());
        familyMemberDTO.setFamilyMemberType(familyMember.getFamilyMemberType());
        familyMemberDTO.setFirstName(familyMember.getFirstName());
        familyMemberDTO.setBirthDate(familyMember.getBirthDate());
        familyMemberDTO.setOccupation(familyMember.getOccupation());
        familyMemberDTO.setWork(familyMember.getWork());
        familyMemberDTO.setYearOfMarriage(familyMember.getYearOfMarriage());
        familyMemberDTO.setSundayHolyMass(familyMember.getSundayHolyMass());
        familyMemberDTO.setConfessionAndHolyCommunion(familyMember.getConfessionAndHolyCommunion());
        familyMemberDTO.setComments(familyMember.getComments());
        return familyMemberDTO;
    }
}
