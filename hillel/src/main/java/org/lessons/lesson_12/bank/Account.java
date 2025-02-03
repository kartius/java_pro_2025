package org.lessons.lesson_12.bank;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Account {

  private ReentrantLock lock = new ReentrantLock();
  private int balance;
  private int id;

  public Account(int balance, int id) {
    this.balance = balance;
    this.id = id;
  }

  public void withdraw(int amount) {
    System.out.println("withdraw");
    balance -= amount;
  }


  public void deposit(int amount) {
    System.out.println("deposit");
    balance += amount;
  }

  public int getBalance() {
    return balance;
  }

  public int getId() {
    return id;
  }

  public ReentrantLock getLock() {
    return lock;
  }

  @Override
  public String toString() {
    return "Account{" +
            "id=" + id +
            '}';
  }
}
