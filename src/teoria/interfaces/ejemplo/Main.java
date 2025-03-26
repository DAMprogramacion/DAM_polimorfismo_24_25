package teoria.interfaces.ejemplo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("12345FF", "startUPCompany");
        Worker plumber1 = null;
        try {
            plumber1 = new SpecialistWorker("12345678a", LocalDate.of(2000, 6, 28),
                    "molina ramirez", "gabriel", LocalDate.of(2015, 1, 1),
                    TypeWorker.PLUMBER, Turn.NIGHT);
            //System.out.println(plumber1.getInformation());
            company.addWorker(plumber1);
        } catch (TypeWorkerException e) {
            throw new RuntimeException(e);
        }
        try {
            Worker general1 = new GeneralWorker("12345678b", LocalDate.of(2000, 6, 28),
                    "molina fernández", "gabriel", LocalDate.of(2015, 1, 1),
                    TypeWorker.PLUMBER, 10, 10.5);
            //System.out.println(general1.getInformation());
            company.addWorker(general1);
        } catch (TypeWorkerException e) {
            System.err.println(e.getMessage());;
        }
        try {
            Worker general2 = new GeneralWorker("12345678c", LocalDate.of(2000, 6, 28),
                    "molina molina", "gabriel", LocalDate.of(2015, 1, 1),
                    TypeWorker.GENERAL, 10, 10.5);
            //System.out.println(general2.getInformation());
            company.addWorker(general2);
        } catch (TypeWorkerException e) {
            System.err.println(e.getMessage());;
        }
        company.getAllWorkers().forEach(worker -> System.out.println(worker.getInformation()));
        double totalSalary = Employed.getTotalSalary(company.getAllWorkers());
        System.out.printf("Total salary: %.2f%n", totalSalary);

        System.out.printf("Total salary with taxes : %.2f, total salary: %.2f%n",
                plumber1.getSalaryWihtTaxes(), plumber1.getSalary());
    }
}