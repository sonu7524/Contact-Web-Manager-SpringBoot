package com.contactWeb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CONTACT")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactId;
    private String contactName;
    private String contactNickName;
    private String contactWork;
    private String contactEmail;
    private int contactPhoneNo;
    private String contactImageUrl;
    @Column(length = 5000)
    private String contactDescription;

    @ManyToOne
    private User user;


    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNickName() {
        return contactNickName;
    }

    public void setContactNickName(String contactNickName) {
        this.contactNickName = contactNickName;
    }

    public String getContactWork() {
        return contactWork;
    }

    public void setContactWork(String contactWork) {
        this.contactWork = contactWork;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(int contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public String getContactImageUrl() {
        return contactImageUrl;
    }

    public void setContactImageUrl(String contactImageUrl) {
        this.contactImageUrl = contactImageUrl;
    }

    public String getContactDescription() {
        return contactDescription;
    }

    public void setContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
