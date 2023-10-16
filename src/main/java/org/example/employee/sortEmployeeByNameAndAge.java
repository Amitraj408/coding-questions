package org.example.employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sortEmployeeByNameAndAge {

    public static void main(String[] args) {

        //sort employee by name if name is same then compare it by age
        //sort employee by its department
        //print name of employee whose salary is greater than 30000
        //print the number of male and female employee
        //print the name of employee who is getting the minimum salary
        //find the min and max salary in each department
        //print all the employee from developer
        //count employee in each department
        //average salary of male and female
        //print the average salary and total salary
        //create the map where emp id is the key and employee detail is the value
        //sort employee first with department and then with name

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"amit", "developer",28, "male", 90000.0),
                new Employee(2,"amit", "developer",29,  "male",90000.0),
                new Employee(3,"rajeshwari", "devops",17, "female", 80000.0),
                new Employee(4,"amita", "developer",28,  "female",75000.),
                new Employee(5,"ravi", "devops",26,  "male",40000.0));

        //sort employee by name if name is same then compare it by age
        employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();

        //sort employee by its department
        Map<String, List<Employee>> groupedByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.entrySet().stream().forEach(System.out::println);

        //print name of employee whose salary is greater than 30000
        employeeList.stream().filter(emp -> emp.getSalary() > 80000.0).map(Employee::getName).toList()
                .forEach(System.out::println);

        //print the number of male and female employee
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet()
                .stream().forEach((entry)-> System.out.println(entry.getKey()+" " +entry.getValue()));

        //print the name of employee who is getting the minimum salary
        String minSalaryEmployee = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get().getName();
        System.out.println("minimum salary Employee: "+minSalaryEmployee);
        employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get().getName();

        System.out.println("____________________________________________________________________");
        //find the min and max salary in each department
        Map<String, DoubleSummaryStatistics> summaryStatisticsMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summarizingDouble(Employee::getSalary)));
        for (Map.Entry<String, DoubleSummaryStatistics> entry:summaryStatisticsMap.entrySet()
             ) {
            System.out.println("department name: "+entry.getKey()+" :: "+"min salary:"+entry.getValue().getMin());
            System.out.println("department name: "+entry.getKey()+"  :: "+"max salary:"+entry.getValue().getMax());

        }

        System.out.println("--------");
        //print all the employee from developer
        employeeList.stream().filter(emp->emp.getDepartment().equals("developer")).map(emp->emp.getName()).forEach(System.out::println);

        //count employee in each department
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .entrySet().stream().forEach(entry-> System.out.println("department: "+entry.getKey()+  " ||"+"  count: "+entry.getValue()));

        System.out.println("-------");
        //average salary of male and female
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));

        //print the average salary and total salary
        DoubleSummaryStatistics salaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(salaryStatistics.getAverage()+" "+salaryStatistics.getSum());

        //create the map where emp id is the key and employee detail is the value
        employeeList.stream().collect(Collectors.groupingBy(Employee::getId)).entrySet().forEach(entry-> System.out.println(entry));

        employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity())).entrySet()
                .forEach(System.out::println);

        System.out.println("============");
        //sort employee first with department and then with name
        employeeList.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName))
                .forEach(e-> System.out.println(e));

    }
}
