package teoria.interfaces.ejemplo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public interface Employed {
    double BASIC_SALARY = 1_200;
    double getSalary();
    String getInformation();
    //metodo default getSalaryWihtTaxes()
    //De 1000 a 1500 las tasas son del 5%, al salario le quitamos el 5%
    //De 1501 a 2000 las tasas son del 7%
    //De 2001 a 2500 las tasas son del 10%
    //Superior a 2500 las tasas son del 14%
    default double getSalaryWihtTaxes() {
        if (getSalary() >= BASIC_SALARY && getSalary() <= 1_500)
            return calculateSalary(5);
        else if (getSalary() > 1_500 && getSalary() <= 2_000)
            return calculateSalary(7);
        else if (getSalary() >= 2_000 && getSalary() <= 2_500)
            return calculateSalary(10);
        else
            return calculateSalary(14);
    }
    private double calculateSalary(int taxes) {
        return getSalary() - getSalary() * taxes / 100;
    }
    static double getTotalSalary(List<Worker> workers) {
        return workers.stream().
                mapToDouble(Worker::getSalary).
                sum();
    }
    static List<String> getSurnamesOfWorkersBySpecialist(List<Worker> workers ,TypeWorker typeWorker) {
        return workers.stream().
                filter(worker -> worker.getTypeWorker().equals(typeWorker)).
                map(Person::getSurname).
                sorted().
                toList();
    }
    private static Worker getOlderWorker(List<Worker> workers) { //devuelve el mas viejo, mas años
        return workers.stream().
                max(Comparator.comparing(Person::getAge)).get();
    }
    static List<Worker> getOlderWorkers(List<Worker> workers) {
        int oldAge = getOlderWorker(workers).getAge();
        return workers.stream().
                filter(worker -> worker.getAge() == oldAge).
                toList();
    }
    private static Worker getOldestWorker(List<Worker> workers) { //devuelve el que tiene más años trabajados
        return workers.stream().
                min(Comparator.comparing(Worker::getStartDay)).get();
    }
    static List<Worker> getOldestWorkers(List<Worker> workers) {
        LocalDate oldStarDay = getOldestWorker(workers).getStartDay();
        return workers.stream().
                filter(worker -> worker.getStartDay().equals(oldStarDay)).
                toList();
    }




}



