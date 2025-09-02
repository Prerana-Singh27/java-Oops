//circle
package com.example.geometry;

public class circle {
    public double radius;

    public circle(double radius) {
        this.radius = radius;
    }
}

//rectangle
package com.example.geometry;

import java.util.Scanner;

public class rectangle {
    public int length;
    public int breadth;

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class BankAccount {
    private String AccountNumber;
    private  String AccountHolderName;
    private double  Balance;

      public BankAccount(String accountHolderName, String accountNumber) {

          this.AccountHolderName = accountHolderName;
          this.AccountNumber = accountNumber;

      }
      public void deposit(double amount) {
          if (amount <= 0) {
              System.out.println("INVALID DEPOSIT");
          } else {
              Balance += amount;
          }
      }
      public double withdraw(double amount) {
          if (amount <= 0) {
              System.out.println("invalid withdraw");
          }else if (Balance >= amount) {
              Balance -= amount;
          } else {
              amount = Balance;
              Balance = 0;
          }
              return amount;
          }
      }
