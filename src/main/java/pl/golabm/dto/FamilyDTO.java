package pl.golabm.dto;

import org.springframework.lang.NonNull;
import pl.golabm.model.Child;
import pl.golabm.model.Family;
import pl.golabm.model.FamilyMember;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyDTO {

    private Long id;

    @NonNull
    private String surname;

    @NonNull
    private String address;

    private String phoneNumber;
    private List<FamilyMemberDTO> familyMembers = new ArrayList<>();
    private List<ChildDTO> childList = new ArrayList<>();
    private Date lastPastoralVisit;

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

    public List<FamilyMemberDTO> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyMemberDTO> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public List<ChildDTO> getChildList() {
        return childList;
    }

    public void setChildList(List<ChildDTO> childList) {
        this.childList = childList;
    }

    public Date getLastPastoralVisit() {
        return lastPastoralVisit;
    }

    public void setLastPastoralVisit(Date lastPastoralVisit) {
        this.lastPastoralVisit = lastPastoralVisit;
    }

    public Family toEntity() {
        Family family = new Family();
        List<FamilyMember> familyMember = familyMembers.stream().map(FamilyMemberDTO::toEntity).collect(Collectors.toList());
        List<Child> children = childList.stream().map(ChildDTO::toEntity).collect(Collectors.toList());
        family.setId(id);
        family.setSurname(surname);
        family.setAddress(address);
        family.setPhoneNumber(phoneNumber);
        family.setFamilyMembers(familyMember);
        family.setChildList(children);
        family.setLastPastoralVisit(lastPastoralVisit);
        return family;
    }

//    public FamilyDTO fromEntity(Family family) {
//        FamilyDTO familyDTO = new FamilyDTO();
//        familyDTO.setId(family.getId());
//        familyDTO.setAddress(family.getAddress());
//        familyDTO.setPhoneNumber(family.getPhoneNumber());
//        familyDTO.setFamilyMembers(family.getFamilyMembers());
//        familyDTO.setChildList(family.getChildList());
//        familyDTO.setLastPastoralVisit(family.getLastPastoralVisit());
//        return familyDTO;
//    }
}
