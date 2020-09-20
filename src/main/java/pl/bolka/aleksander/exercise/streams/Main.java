package pl.bolka.aleksander.exercise.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.init();
    List<Account> accounts = bank.getAccounts();

    //Pobierz wszystkie imiona właścicieli kont
    List<String> collect = accounts.stream()
                                   .map(account -> account.getOwner().getName())
                                   .collect(Collectors.toList());

    List<String> names = new ArrayList<>();
    for (Account account : accounts) {
      names.add(account.getOwner().getName());
    }

    System.out.println(collect);
    System.out.println();
    System.out.println(names);

    // Wylicz sumę jaka jest zdeponowana w banku w PLN

    // Pokaż wszystkich użytkowników którzy są niepełnoletni
    List<Owner> collect1 = accounts.stream()
                                     .filter(account -> account.getOwner().getAge() < 18)
                                     .map(Account::getOwner)
                                     .collect(Collectors.toList());

    // Oblicz sumę pieniędzy zdeponowana w banku użytkowników pełnoletnich. Sumę podaj w euro.

    // Posortuj właścicieli pod względem sumy na koncie w przeliczeniu na pln

    // Wyświetl konto użytkownika z największą sumą pieniedzy

    // Stwórz mapę gdzie klucz to pesel a wartość to konto

  }
}
