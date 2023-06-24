package optional;

import modal.Employee;
import services.EmpListService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptionalReviseBasic {

    public static void main(String[] args) {

        Employee emp = EmpListService.defaultEmployee;

        //Optional.empty() will always return an empty Optional object
        System.out.println("==============empty()==============");
        Optional<Employee> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional.of() will return the given object wrapped as Optional or will throw null pointer exception
        System.out.println("==============of()==============");
        Optional<Employee> nonEmptyOptional = Optional.of(emp);
        System.out.println(nonEmptyOptional);


        System.out.println("==============ofNullable()==============");
        //(1) Non-null object
        Optional<Employee> emp1 = Optional.ofNullable(emp);
        System.out.println(emp1);
        //(2) null object
        Optional<Employee> emp2 = Optional.ofNullable(new Employee());
        System.out.println(emp2);
    }
}
