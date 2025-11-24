public class Main {
  public static void main(String[] args) {
    Employee employeeOne = new Employee("John", 32, 1000.00, "LA");
    Employee employeeTwo = new Employee("Sally", 28, 1200.00, "NY");

    employeeOne.raiseSalary();
    System.out.println(employeeOne.getSalary());

    employeeTwo.raiseSalary();
    System.out.println(employeeTwo.getSalary());
  }
}
