package com.example.AMS.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Yearly_Verification")
public class H_Yearlyverification {

    @Id
    @Column(name = "VerificationID")
    private String verificationId;

    @ManyToOne
    @JoinColumn(name = "Asset_ID")
    private Asset asset;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User user;

    @Column(name = "Verification_Date")
    @Temporal(TemporalType.DATE)
    private Date verificationDate;

    @Column(name = "Verification_Details")
    private String verificationDetails;

    @Column(name = "Verification")
    private Boolean verification;

    // --- Getters and Setters ---

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getVerificationDetails() {
        return verificationDetails;
    }

    public void setVerificationDetails(String verificationDetails) {
        this.verificationDetails = verificationDetails;
    }

    public Boolean getVerification() {
        return verification;
    }

    public void setVerification(Boolean verification) {
        this.verification = verification;
    }
}
