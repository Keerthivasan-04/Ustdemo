package com.ust.collections;

public class Mobile {
	String mobileModel;
    String mobileMake;
    double mobilePrice;

    
    public Mobile(String mobileModel, String mobileMake, double mobilePrice) {
        this.mobileModel = mobileModel;
        this.mobileMake = mobileMake;
        this.mobilePrice = mobilePrice;
    }

    
    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileMake() {
        return mobileMake;
    }

    public void setMobileMake(String mobileMake) {
        this.mobileMake = mobileMake;
    }

    public double getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    
    @Override
    public String toString() {
        return "Mobile [Model=" + mobileModel +
               ", Make=" + mobileMake +
               ", Price=" + mobilePrice + "]";
    }


}
