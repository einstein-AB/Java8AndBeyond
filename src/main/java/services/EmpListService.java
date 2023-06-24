package services;

import modal.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmpListService {

    //Default Employee
    public static Employee defaultEmployee = new Employee(0, "AB", 25000.00, new ArrayList());

    //Contacts List
    public static List<String> contacts = Arrays.asList("1234506789", "8765403217", "765403217");

    //Unique EmployeeIds
    public static List<Integer> empIds = IntStream.rangeClosed(1, 5)
            .distinct()
            .boxed()
            .collect(Collectors.toList());

    //--------------------------------------------------------------------------------//
    //Creating list of Employee objects with dummy data
    public static List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<>();
        empIds.forEach(id -> {
            empList.add(new Employee(id, "Emp "+id, id*10.0, contacts));
        });

        //Shuffling emp list for randomness
        Collections.shuffle(empList);
        return empList;
    }
}
