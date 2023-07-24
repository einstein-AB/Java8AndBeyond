package streams.reduce;

import modal.Employee;
import services.EmpListService;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class ReduceExampleRealtime {

    public static void main(String[] args) {

        List<Employee> empList = EmpListService.getEmpList();

        //challenge 1 --> get average salary of all employees whose id is even
        //challenge 2 --> get sum of salary of all employees whose id is odd

        //Challenge -1
        OptionalDouble average = empList.stream()
                .filter(employee -> employee.getEmpId() % 2 == 0) //filter out all emp whose id is even
                .map(employee -> employee.getEmpSalary())
                .mapToDouble(sal -> sal)
                .average();
        System.out.println("Average: "+ average.getAsDouble());

        //Challenge - 2
        double sum = empList.stream()
                .filter(employee -> employee.getEmpId() % 2 != 0)
                .map(employee -> employee.getEmpSalary())

                .reduce(0.0, (a, b)-> a+b);
                //-------OR-------
                //.mapToDouble(sal -> sal)
                //.sum();
        System.out.println("Sum of Salaries: "+sum);




        //Bonus method to do all the aggregate operations at once
        DoubleSummaryStatistics summaryStatistics = empList.stream()
                .filter(employee -> employee.getEmpId() % 2 == 0) //filter out all emp whose id is even
                .map(employee -> employee.getEmpSalary())
                .mapToDouble(sal -> sal)
                .summaryStatistics();

        System.out.println("==========Summary Statistics==========");
        System.out.println("Average: "+summaryStatistics.getAverage());
        System.out.println("Sum: "+summaryStatistics.getSum());
        System.out.println("Max: "+summaryStatistics.getMax());
        System.out.println("Min: "+summaryStatistics.getMin());
        System.out.println("Count: "+summaryStatistics.getCount());

    }
}
