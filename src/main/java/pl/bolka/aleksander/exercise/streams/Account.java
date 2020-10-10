package pl.bolka.aleksander.exercise.streams;

public class Account {

  private Money money;

  private Owner owner;

  public Account(Money money, Owner owner) {
    this.money = money;
    this.owner = owner;
    // To jest komentarz 3
  }

  public Money getMoney() {
    return money;
  }

  public void setMoney(Money money) {
    this.money = money;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }
}
