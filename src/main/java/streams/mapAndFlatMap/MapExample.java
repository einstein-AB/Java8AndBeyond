package streams.mapAndFlatMap;

import modal.Employee;
import services.EmpListService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

    /* map() is used for data transformation
    * Converting one type of source data to another
    * Example converting list of employees to list of String (eg; extracting names of emp from a list of emp obj)
    * List<Employee> -----> List<String>
    * ONE TO ONE MAPPING (one emp can have only one official name)
    */

    public static void main(String[] args) {

        //Dummy List of Emp
        List<Employee> empList = EmpListService.getEmpList();
        empList.forEach(employee -> System.out.println(employee));

        System.out.println("=============================================");

        //map() = Transform
        //map() = List<Employee> ==> List<String> (collecting/extracting names of all emp)
        List<String> empNamesList = empList.stream()
                .map(emp -> emp.getEmpName())
                .collect(Collectors.toList());
        empNamesList.forEach(employee -> System.out.println(employee));
    }
}
