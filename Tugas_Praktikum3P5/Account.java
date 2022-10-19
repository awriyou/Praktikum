/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum3P5;

/**
 *
 * @author Visitor
 */
public class Account {
    protected double balance;
    Account(double initBalance){
        
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt){
        return true;
    }
    
    public boolean withdraw(){
        getBalance();
        return true;
    }
    
}



