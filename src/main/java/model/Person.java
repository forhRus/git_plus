package model;


public class Person {

  //region Fields
  private String firstName;
  private String lastName;
  private int age;
  //endregion

  //region Consrtuctors
  public Person() {
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  //endregion

  //region Getters & Setters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }
  //endregion
}

