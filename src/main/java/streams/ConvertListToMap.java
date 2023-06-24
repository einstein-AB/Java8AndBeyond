package streams;

import modal.Employee;
import services.EmpListService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static void main(String[] args) {
        //Dummy List of Emp
        List<Employee> empList = EmpListService.getEmpList();
        empList.forEach(employee -> System.out.println(employee));

        System.out.println("=============================================");

        //List ==> Map when keys are UNIQUE
        Map<Integer, String> id_name_map = empList.stream()
                .collect(Collectors.toMap(employee -> employee.getEmpId(), employee -> employee.getEmpName()));

        //List ==> Map when keys are UNIQUE
        Map<Integer, String> id_name_map_duplicateKeys = empList.stream()
                .collect(Collectors.toMap(
                        employee -> employee.getEmpId(),
                        employee -> employee.getEmpName(),
                        (oldKey, newKey) -> oldKey)); // what key to use if duplicate keys are found (here prefer oldKey)

        //List ==> Map when output streamMap needs to be converted to another type of map
        //Example when I want to preserve the order I would store the newly created map in a LinkedList
        LinkedHashMap<Integer, String> collect = empList.stream()
                .collect(Collectors.toMap(
                        employee -> employee.getEmpId(),
                        employee -> employee.getEmpName(),
                        (oldKey, newKey) -> oldKey,
                        LinkedHashMap::new));

        id_name_map.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() +" : "+ entry.getValue()));


    }
}
