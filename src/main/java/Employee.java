public class Employee {
  // attributes
  String name;
  int age;
  double salary;
  String location;

  // constructor
  public Employee(String name, int age, double salary, String location) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.location = location;
  }

  // behavior
  void raiseSalary() {
    this.salary = this.salary * 1.2;
  }

  void raiseSalary(double amount) {
    this.salary += amount;
  }

  double getSalary() {
    return this.salary;
  }
}
