/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

public class Checking extends Account {
    private double interestRate;

    public Checking(String number, double balance, Client owner, double interestRate) {
        super(number, balance, owner);
        if (interestRate < 0) {
            throw new IllegalArgumentException("El interés no puede ser negativo");
        }
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        // interés mensual
        double interest = (getBalance() * interestRate) / 12;
        setBalance(getBalance() + interest);

        System.out.println("Se han aplicado intereses por: " + interest);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Account Type: Checking\n"
                + "Interest Rate: " + interestRate + "\n";
    }
}

