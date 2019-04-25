package pl.golabm.dto;

import org.springframework.lang.NonNull;
import pl.golabm.model.Child;
import pl.golabm.model.ConfessionAndHolyCommunion;
import pl.golabm.model.SundayHolyMass;

import java.util.Date;

public class ChildDTO {

    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private Date birthDate;

    @NonNull
    private Date baptismDate;

    @NonNull
    private Date firstCommunionDate;

    private Date confirmationDate;
    private SundayHolyMass sundayHolyMass;
    private ConfessionAndHolyCommunion confessionAndHolyCommunion;
    private String participationInCatechesis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getBaptismDate() {
        return baptismDate;
    }

    public void setBaptismDate(Date baptismDate) {
        this.baptismDate = baptismDate;
    }

    public Date getFirstCommunionDate() {
        return firstCommunionDate;
    }

    public void setFirstCommunionDate(Date firstCommunionDate) {
        this.firstCommunionDate = firstCommunionDate;
    }

    public Date getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(Date confirmationDate) {
        this.confirmationDate = confirmationDate;
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

    public String getParticipationInCatechesis() {
        return participationInCatechesis;
    }

    public void setParticipationInCatechesis(String participationInCatechesis) {
        this.participationInCatechesis = participationInCatechesis;
    }

    public Child toEntity() {
        Child child = new Child();
        child.setId(id);
        child.setFirstName(firstName);
        child.setBirthDate(birthDate);
        child.setBaptismDate(baptismDate);
        child.setFirstCommunionDate(firstCommunionDate);
        child.setConfirmationDate(confirmationDate);
        child.setSundayHolyMass(sundayHolyMass);
        child.setConfessionAndHolyCommunion(confessionAndHolyCommunion);
        child.setParticipationInCatechesis(participationInCatechesis);
        return child;
    }

    public ChildDTO fromEntity(Child child) {
        ChildDTO childDTO = new ChildDTO();
        childDTO.setId(child.getId());
        childDTO.setFirstName(child.getFirstName());
        childDTO.setBirthDate(child.getBirthDate());
        childDTO.setBaptismDate(child.getBaptismDate());
        childDTO.setFirstCommunionDate(child.getFirstCommunionDate());
        childDTO.setConfirmationDate(child.getConfirmationDate());
        childDTO.setSundayHolyMass(child.getSundayHolyMass());
        childDTO.setConfessionAndHolyCommunion(child.getConfessionAndHolyCommunion());
        childDTO.setParticipationInCatechesis(child.getParticipationInCatechesis());
        return childDTO;
    }
}
