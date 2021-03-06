package com.jeep.furama.model.contractDetail;

import javax.persistence.*;
import java.util.List;

@Entity
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attachFacilityId;
    private String attachFacilityName;
    private double attachFacilityCost;
    private String attachFacilityUnit;
    private String attachFacilityStatus;
    @OneToMany(mappedBy = "attachFacility")
    private List<ContractDetail> contractDetailList;

    public AttachFacility() {
    }

    public AttachFacility(String attachFacilityName, double attachFacilityCost,
                          String attachFacilityUnit, String attachFacilityStatus) {
        this.attachFacilityName = attachFacilityName;
        this.attachFacilityCost = attachFacilityCost;
        this.attachFacilityUnit = attachFacilityUnit;
        this.attachFacilityStatus = attachFacilityStatus;
    }

    public AttachFacility(int attachFacilityId, String attachFacilityName, double attachFacilityCost,
                          String attachFacilityUnit, String attachFacilityStatus) {
        this.attachFacilityId = attachFacilityId;
        this.attachFacilityName = attachFacilityName;
        this.attachFacilityCost = attachFacilityCost;
        this.attachFacilityUnit = attachFacilityUnit;
        this.attachFacilityStatus = attachFacilityStatus;
    }

    public AttachFacility(String attachFacilityName, double attachFacilityCost, String attachFacilityUnit,
                          String attachFacilityStatus, List<ContractDetail> contractDetailList) {
        this.attachFacilityName = attachFacilityName;
        this.attachFacilityCost = attachFacilityCost;
        this.attachFacilityUnit = attachFacilityUnit;
        this.attachFacilityStatus = attachFacilityStatus;
        this.contractDetailList = contractDetailList;
    }

    public AttachFacility(int attachFacilityId, String attachFacilityName, double attachFacilityCost,
                          String attachFacilityUnit, String attachFacilityStatus, List<ContractDetail> contractDetailList) {
        this.attachFacilityId = attachFacilityId;
        this.attachFacilityName = attachFacilityName;
        this.attachFacilityCost = attachFacilityCost;
        this.attachFacilityUnit = attachFacilityUnit;
        this.attachFacilityStatus = attachFacilityStatus;
        this.contractDetailList = contractDetailList;
    }

    public int getAttachFacilityId() {
        return attachFacilityId;
    }

    public void setAttachFacilityId(int attachFacilityId) {
        this.attachFacilityId = attachFacilityId;
    }

    public String getAttachFacilityName() {
        return attachFacilityName;
    }

    public void setAttachFacilityName(String attachFacilityName) {
        this.attachFacilityName = attachFacilityName;
    }

    public double getAttachFacilityCost() {
        return attachFacilityCost;
    }

    public void setAttachFacilityCost(double attachFacilityCost) {
        this.attachFacilityCost = attachFacilityCost;
    }

    public String getAttachFacilityUnit() {
        return attachFacilityUnit;
    }

    public void setAttachFacilityUnit(String attachFacilityUnit) {
        this.attachFacilityUnit = attachFacilityUnit;
    }

    public String getAttachFacilityStatus() {
        return attachFacilityStatus;
    }

    public void setAttachFacilityStatus(String attachFacilityStatus) {
        this.attachFacilityStatus = attachFacilityStatus;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
