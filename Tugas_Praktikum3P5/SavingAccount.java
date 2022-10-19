/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Praktikum3P5;

/**
 *
 * @author Visitor
 */
public class SavingAccount extends Account {
    private double InterestRate;
    SavingAccount(double balance, double Interest_rate){
        super(balance);
        this.InterestRate = Interest_rate;
    }
}
