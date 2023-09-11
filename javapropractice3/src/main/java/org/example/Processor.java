package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Processor {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Tom", "Ford", 10000);
        Employee employee2 = new Employee("Christian", "Dior", 12000);
        Employee employee3 = new Employee("Yef", "SentLoran", 15000);
        Employee employee4 = new Employee("Isey", "Miaki", 17000);
        Employee employee5 = new Employee("Stefan", "Ford", 19000);
        Employee employee6 = new Employee("Mickhail", "Ford", 21000);

        Employee[] employeesData = {
                employee1,
                employee2,
                employee3,
                employee5,
                employee6
        };

        Employee[] employeesData1 = {
                employee1,
                employee2,
                employee3,
                employee4
        };

        Department department = new Department("Lawyers", employeesData);
        Department department1 = new Department("Economics", employeesData1);

        Department[] departments = {department, department1};

        Company company = new Company("AI-Tech", departments);

        Processor processor = new Processor();
//        System.out.println(processor.getAvgSalaryByDep(department));
//
//        System.out.println(processor.getEmployeeWithSimilarSur(company));

//        System.out.println(processor.getDepWithMaxSalary(company));
    }

    public double getAvgSalaryByDep(Department department) {
        double avgSalary;
        double sum = 0;
        for (int i = 0; i < department.getEmployees().length; i++) {
            sum += department.getEmployees()[i].getSalary();
        }
        avgSalary = sum / department.getEmployees().length;
        return avgSalary;
    }

    public Department getDepWithMaxSalary(Company company) {
        Processor processor = new Processor();
        Department depMaxSum = company.getDepartments()[0];
        for (Department department : company.getDepartments()) {
            if (processor.getAvgSalaryByDep(department) > processor.getAvgSalaryByDep(depMaxSum)) {
                depMaxSum = department;
            }
        }
        return depMaxSum;
    }

    public Employee getEmployeeWithSimilarSur(Company company) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < company.getDepartments().length; i++) {
            for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
                employees.add(company.getDepartments()[i].getEmployees()[i]);
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            if (i == employees.size() - 1){
                return null;
            }
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getSurName().equals(employees.get(j).getSurName())) {
                    return employees.get(i);
                }
            }
        }
        return null;
    }
}
