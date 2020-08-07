package pl.bolka.aleksander.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Bank {

  private List<Account> accounts = new ArrayList<>();

  public void init(){
    accounts.add(new Account(new Money(100d,Currency.PLN),
        new Owner("Janek", "123123123123",
        new Address("Warszawska","Kraków", 12),19)));
    accounts.add(new Account(new Money(123d,Currency.EUR),
        new Owner("Franek", "231312323121",
            new Address("Krakowska","Warszawa", 1),17)));
    accounts.add(new Account(new Money(321d,Currency.GBP),
        new Owner("Wiesiu", "564536563634",
            new Address("Bydgoska","Warszawa", 44),44)));
    accounts.add(new Account(new Money(2222d,Currency.EUR),
        new Owner("Rysiu", "1454861324564",
            new Address("Poznańska","Warszawa", 99),32)));
    accounts.add(new Account(new Money(445566d,Currency.GBP),
        new Owner("Halina", "3214831234564",
            new Address("Gdańska","Kraków", 87),15)));
    accounts.add(new Account(new Money(10d,Currency.PLN),
        new Owner("Grażyna", "78975352313",
            new Address("Łódzka","Kraków", 65),82)));
    accounts.add(new Account(new Money(-199d,Currency.PLN),
        new Owner("Adam", "123543423134",
            new Address("Szczecińska","Poznań", 23),77)));
    accounts.add(new Account(new Money(789d,Currency.EUR),
        new Owner("Ewa", "6653232388",
            new Address("Wrocławska","Poznań", 111),33)));
    accounts.add(new Account(new Money(10d,Currency.EUR),
        new Owner("Jan", "4568631231",
            new Address("Zakopiańska","Poznań", 33),18)));
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
}
