package org.example.employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployeeByName {



    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"amit", "developer",16, "male", 90000.0),
                new Employee(2,"amit", "developer",29,  "male",90000.0),
                new Employee(3,"rani", "devops",17, "female", 80000.0),
                new Employee(4,"amita", "developer",28,  "female",75000.),
                new Employee(5,"ravi", "devops",26,  "male",40000.0));


        groupEmployee1(employeeList);
        groupEmployee2(employeeList);
        groupEmployee3(employeeList);

    }

    //short and simple
    public static void groupEmployee1(List<Employee> employeeList ){
        Map<String,List<Employee>> byName=new HashMap<>();

        for (Employee employee : employeeList) {
            String name = employee.getName();
            if (!byName.containsKey(name)) {
                byName.put(name, new ArrayList<>());
            }
            byName.get(name).add(employee);
        }
        for (Map.Entry<String,List<Employee>> map:byName.entrySet()
        ) {
            System.out.println(map.getKey()+" :: "+map.getValue());

        }
    }
    public static void groupEmployee2(List<Employee>  employeeList){

        Map<String,List<Employee>> byName=new HashMap<>();

        for (Employee employee: employeeList) {
            List<Employee> list;
            if(byName.containsKey(employee.getName())){

                list = byName.get(employee.getName());

            }else{
                list= new ArrayList<>();
                byName.put(employee.getName(),list);
            }
            list.add(employee);

        }
        for (Map.Entry<String,List<Employee>> map:byName.entrySet()
        ) {
            System.out.println(map.getKey()+" :: "+map.getValue());

        }

    }
    public static void groupEmployee3(List<Employee>  employeeList){
        employeeList.stream().collect(Collectors.groupingBy(
                e->e.getName(),Collectors.mapping(e->e.getAge(),Collectors.toList())
        )).forEach((k,v)-> System.out.println(k+" || "+v));

        Map<String, List<Double>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getSalary, Collectors.filtering(e -> e >= 90000.0, Collectors.toList()))));
        System.out.println(collect1);
        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.filtering(emp -> emp.getId() > 3, Collectors.toList())));
        System.out.println(collect);
    }
}
