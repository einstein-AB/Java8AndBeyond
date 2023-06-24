package comparison;

import modal.Employee;
import services.EmpMapService;

import java.util.*;

public class ComparingMap {
    public static void main(String[] args) {
        Map<Integer, Employee> empMap = EmpMapService.getEmpMap();

        //Using Collections.sort()
        List<Map.Entry<Integer, Employee>> empMapList = new ArrayList<>(empMap.entrySet());
        Collections.sort(empMapList, (o1, o2) -> o1.getValue().getEmpName().compareTo(o2.getValue().getEmpName()));
        Collections.sort(empMapList, Comparator.comparing(entry -> entry.getValue().getEmpName()));

        //Using stream().sorted()
        empMap.entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getValue().getEmpSalary().compareTo(o2.getValue().getEmpSalary()));
        empMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> entry.getValue().getEmpSalary()));

        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((o1, o2) -> o1.getEmpId()));
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(emp -> emp.getEmpId())));







    }
}
