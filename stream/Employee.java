package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
  static List<Employee> employeeList = new ArrayList<>();

    int id;
    String Firstname;
    String Lastname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    String department;
    double salary;
    String gender;
    int age;

    public Employee() {
    }
    public Optional<Employee> getEmployee(int id) {
        Optional<Employee> employee = employeeList.stream()
                .filter(employeeList -> employeeList.getId() == id).findFirst();
        if (employee.isEmpty()) {
            throw new CustomException("Employee with this id  details is not present in list ..");
        } else {

            return Optional.of(employee.get());
        }
    }

    public Employee(int id, String firstname, String lastname, String department,
                    double salary, String gender, int age) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public static void main(String[] args) {
        employeeList.add(new Employee(101,"Nana","Patekar","quality",25000.00,"male",24));
        employeeList.add(new Employee(102,"Manik","Tyagi","testing",55000.00,"male",23));
        employeeList.add(new Employee(103,"Rohini","Petkar","sales",90000.00,"female",21));
        employeeList.add(new Employee(104,"Digvijay","Bakre","sales",35000.00,"male",25));
        employeeList.add(new Employee(105,"Mohini","Raut","testing",55000.00,"female",28));
        employeeList.add(new Employee(106,"Manoj","Kumar","sales",35000.00,"male",24));
        employeeList.add(new Employee(107,"Dipika","Kalyani","testing",12000.00,"female",23));
        employeeList.add(new Employee(108,"Bhshan","Tupkari","quality",25000.00,"male",25));
        employeeList.add(new Employee(109,"Krishna","Patil","sales",34000.00,"male",29));
        employeeList.add(new Employee(110,"Hina","Khatik","testing",55000.00,"female",22));

        System.out.println(employeeList+"\n");



        List<Employee> employee = employeeList.stream()
                .sorted((a,b) -> (int) (a.getSalary()-b.getSalary()))
                .collect(Collectors.toList());

       //  employee with highest salary
        List<Employee> employee1 = employeeList.stream().
                max((a,b)-> (int) (a.getSalary()-b.getSalary()))
                .stream()
                .collect(Collectors.toList());
        System.out.println("employee with highest salary is = "+employee1+"\n");

        // find the total of  salary of all employees
        double sum_salary = employeeList.stream()
                .mapToDouble(a->a.getSalary())
                .sum();
        System.out.println("total sum of salary in organization = "+sum_salary+"\n");

        // department wise average salary
        Map<String,Double> avgDeptSalary = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("department wise average salary = "+avgDeptSalary+"\n");

        // department wise sum of  salary
        Map<String,Double> sumDeptSalary = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
        System.out.println("department wise sum of  salary = "+sumDeptSalary+"\n");

        // find out the youngest employee from the organization in each department
        Map<String, Optional<Employee>> youngestEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy((a,b)->-(a.getAge()-b.getAge()))));
        System.out.println(youngestEmp);


        // remove the employee from list having id
        List<Employee> list = employeeList.stream().filter(a->a.getId()!=101).collect(Collectors.toList());
        System.out.println(list);

        try {
            Employee employee2 = new Employee();
            employee2.getEmployee(101);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
