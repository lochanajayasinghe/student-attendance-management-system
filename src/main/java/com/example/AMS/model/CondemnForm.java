package com.example.Login.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CondemnForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long assetId; // Reference to Asset entity

    private String reason;

    @Temporal(TemporalType.DATE)
    private Date dateCondemned;

    private String condemnedBy;

    private String remarks;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getAssetId() { return assetId; }
    public void setAssetId(Long assetId) { this.assetId = assetId; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public Date getDateCondemned() { return dateCondemned; }
    public void setDateCondemned(Date dateCondemned) { this.dateCondemned = dateCondemned; }

    public String getCondemnedBy() { return condemnedBy; }
    public void setCondemnedBy(String condemnedBy) { this.condemnedBy = condemnedBy; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}