package com.example.AMS.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Asset")
public class H_Asset {

    @Id
    @Column(name = "Asset_ID", nullable = false)
    private String assetId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Model")
    private String model;

    @Column(name = "Specification")
    private String specification;

    @Column(name = "PurchaseDate")
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;

    @Column(name = "Activity_Status")
    private Boolean activityStatus;

    @Column(name = "Warranty_ID")
    private String warrantyId;

    @Column(name = "Warranty_Date")
    @Temporal(TemporalType.DATE)
    private Date warrantyDate;

    @Column(name = "Warranty_Period")
    private String warrantyPeriod;

    @Column(name = "Purchase_Store")
    private String purchaseStore;

    @ManyToOne
    @JoinColumn(name = "LocationID")
    private Location location;

    // --- Getters and Setters ---

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Boolean getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Boolean activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getWarrantyId() {
        return warrantyId;
    }

    public void setWarrantyId(String warrantyId) {
        this.warrantyId = warrantyId;
    }

    public Date getWarrantyDate() {
        return warrantyDate;
    }

    public void setWarrantyDate(Date warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getPurchaseStore() {
        return purchaseStore;
    }

    public void setPurchaseStore(String purchaseStore) {
        this.purchaseStore = purchaseStore;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
