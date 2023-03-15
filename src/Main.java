public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Ivan Ivanov" + i, 1 + (i % 5), 10000 * (i + 1));
        }

        System.out.println("a. Наши сотрудники: ");
        printEmployees(employees);

        System.out.println("b. Итоговая зарплата сотрудников = " + calculateTotalSalary(employees));

        Employee employeeWithMinSalary = getEmployeeWithMinSalary(employees);
        System.out.println("c. Сотрудник с минимальной ЗП = " + employeeWithMinSalary);

        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary(employees);
        System.out.println("d. Сотрудник с максимальной ЗП = " + employeeWithMaxSalary);

        double averageSalary = calculateAverageSalary(employees);
        System.out.println("e. Средняя ЗП сотрудников = " + averageSalary);

        System.out.println("f. ФИО сотрудников: ");
        printFullNameEmployees(employees);
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }

    private static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }

        return result;
    }

    private static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > result.getSalary()) {
                result = employee;
            }
        }

        return result;
    }

    private static double calculateAverageSalary(Employee[] employees) {

        int totalSalary = calculateTotalSalary(employees);
        return (double) totalSalary / employees.length;
    }

    private static void printFullNameEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

}
