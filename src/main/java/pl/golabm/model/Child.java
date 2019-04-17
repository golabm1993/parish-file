package pl.golabm.model;

import java.util.Date;

public class Child {

    private String firstName;
    private Date birthDate;
    private Date baptismDate;
    private Date firstCommunionDate;
    private Date confirmationDate;
    private SundayHolyMass sundayHolyMass;
    private ConfessionAndHolyCommunion confessionAndHolyCommunion;
    private String participationInCatechesis;

    public Child() {
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
}
