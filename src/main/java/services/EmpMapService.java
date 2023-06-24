package services;

import modal.Employee;

import java.util.*;

public class EmpMapService {

    public static Map<Integer, Employee> getEmpMap() {
        Map<Integer, Employee> empMap = new HashMap<>();
        EmpListService.empIds.forEach(id -> {
            empMap.put(id,
                    new Employee(id, "Emp "+id, id*10.0, EmpListService.contacts));
        });
        return empMap;
    }
}
