package comparison;

import modal.Employee;
import services.EmpListService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingList {

    public static void main(String[] args) {
        List<Employee> empList = EmpListService.getEmpList();

        //Using Collections.sort()
        Collections.sort(empList, (o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
        Collections.sort(empList, Comparator.comparing(employee -> employee.getEmpName(), Collections.reverseOrder()));

        //Using stream().sorted()
        empList.stream().sorted((o1, o2) -> o1.getEmpSalary().compareTo(o2.getEmpSalary())); //---> A
        empList.stream().sorted(Comparator.comparing(employee -> employee.getEmpSalary(), Comparator.reverseOrder()));  //---> B
    }
}
