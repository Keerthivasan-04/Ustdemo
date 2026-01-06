package com.ust.crypto.ustcoin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.crypto.ustcoin.beans.CryptoConverter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
         context.scan("com.ust.crypto.ustcoin");


         context.refresh();


         CryptoConverter cryptoConverter = context.getBean(CryptoConverter.class);


         cryptoConverter.setAmount(25000.75);


         System.out.println("Crypto Amount: " + cryptoConverter.getAmount());
    }
}
