/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum3P5;

/**
 *
 * @author Visitor
 */
public class CheckingAccount extends Account {
    
    private double overdraftProtection;
    public CheckingAccount(double balance, double protect){
        super(balance);
        this.overdraftProtection = protect;
        protect = -1.0;
    }
    CheckingAccount(double balance){
        super(this.balance);
        
    }
    double saldo =
}
