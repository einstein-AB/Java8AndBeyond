package streams.mapAndFlatMap;

import modal.Employee;
import services.EmpListService;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    /* flatmap() is used for data transformation + flattening of data
     * Converting one type of source data to another. then flattening it
     * Example converting list of emp to list of Integers of emp (eg; extracting ph. no. of emp from a list of emp obj)
     * List<Employee> -----> List<Integers>
     * ONE TO MANY MAPPING (one emp can have multiple contactNumbers)
     */

    public static void main(String[] args) {

        //Dummy List of Emp
        List<Employee> empList = EmpListService.getEmpList();
        empList.forEach(employee -> System.out.println(employee));

        System.out.println("=============================================");

        //flatMap() = map(transform) + flattening (converting to single stream)
        //flatMap() = List<Employee> ===> List<Integer> (collecting/extracting contacts of all emp)
        List<String> empContactList = empList.stream()
                .flatMap(employee -> employee.getContacts().stream())
                .collect(Collectors.toList());
        empContactList.forEach(contacts-> System.out.println(contacts));
    }
}
