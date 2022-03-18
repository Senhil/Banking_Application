package com.bankapplication.oops;

//In this we will be making a simple banking application using core java and oops.

//user opening account
//depositing money
//withdrawing money

//username, user account no, user email, user phn no, account balance
//deposit, withdraw


public class Main {
    public static void main(String[] args) {
        Account SKaccount = new Account(123,0.0,"SK", "555", 12345);

        SKaccount.DepositMoney(1000);
//        SKaccount.DepositMoney(3000);
//        SKaccount.WithdrawMoney(2000);

    }
}


