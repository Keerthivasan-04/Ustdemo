package com.ust.crypto.ustcoin.beans;
import org.springframework.stereotype.Component;

@Component
public class CryptoConverter {
	
	private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
	
	
}
