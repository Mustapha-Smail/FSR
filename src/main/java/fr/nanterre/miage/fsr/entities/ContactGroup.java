package fr.nanterre.miage.fsr.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactGroup {


    @Id
    private Long groupId;
    private String groupName;

    public ContactGroup() {
    }

    public ContactGroup(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "ContactGroup{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
