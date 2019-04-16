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

}
