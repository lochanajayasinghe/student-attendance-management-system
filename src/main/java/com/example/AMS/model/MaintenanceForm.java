package com.example.AMS.model;

package com.example.Login.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class MaintenanceForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long assetId; // Reference to Asset entity

    private String maintenanceType; // e.g., Repair, Preventive

    private String description;

    @Temporal(TemporalType.DATE)
    private Date dateRequested;

    @Temporal(TemporalType.DATE)
    private Date dateCompleted;

    private String performedBy;

    private String remarks;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getAssetId() { return assetId; }
    public void setAssetId(Long assetId) { this.assetId = assetId; }

    public String getMaintenanceType() { return maintenanceType; }
    public void setMaintenanceType(String maintenanceType) { this.maintenanceType = maintenanceType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Date getDateRequested() { return dateRequested; }
    public void setDateRequested(Date dateRequested) { this.dateRequested = dateRequested; }

    public Date getDateCompleted() { return dateCompleted; }
    public void setDateCompleted(Date dateCompleted) { this.dateCompleted = dateCompleted; }

    public String getPerformedBy() { return performedBy; }
    public void setPerformedBy(String performedBy) { this.performedBy = performedBy; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}
