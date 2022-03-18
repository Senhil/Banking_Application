package com.bankapplication.oops;



public class Account {
    private int number;
    private Double balance;
    private String name;
    private String email;
    private int phone;

         //parameterized constructors

    public Account(int number, double balance, String name, String email, int phone) {

         //initiating all the constructors

        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    // creating methods/functions for deposit and withdraw

    public void DepositMoney(double DepositMoney) {
        this.balance += DepositMoney;
        System.out.println("Successfully deposited current balance is " + this.balance);

    }


    public void WithdrawMoney(double WithdrawMoney) {

        //creating if loop so just checking balance is less than withdrawing

        if (this.balance - WithdrawMoney < 0) {
            System.out.println("Withdraw unsuccessful only " + this.balance + " is left");
        } else {
            this.balance -= WithdrawMoney;
            {
                System.out.println("Withdraw Successful Current balance is " + this.balance);
            }
        }

    }
}

