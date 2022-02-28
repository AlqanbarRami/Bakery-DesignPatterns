package com.company.SalesManager;


public class SalesManager {

    private  int customerId;
    private String customerName;
    private int cakeId;
    private String cakeName;

    public SalesManager(int customerId, String customerName, int cakeId, String cakeName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.cakeId = cakeId;
        this.cakeName = cakeName;
    }


    @Override
    public String toString() {
        return "SalesManager{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", cakeId=" + cakeId +
                ", cakeName='" + cakeName + '\'' +
                '}';
    }
}
