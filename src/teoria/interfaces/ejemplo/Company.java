package teoria.interfaces.ejemplo;

import java.time.LocalDate;
import java.util.*;

public class Company {
    private final String CIF;
    private String companyName;
    private final Map<String, Worker> workers = new HashMap<>();

    public Company(String CIF, String companyName) {
        this.CIF = CIF;
        this.companyName = companyName;
    }

    public String getCIF() {
        return CIF;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Map<String, Worker> getWorkers() {
        return workers;
    }

    //CRUD
    public Worker addWorker(Worker worker) {
        return workers.put(worker.getId(), worker);
    }

    public Worker deleteWorkerByID(String id) {
        return workers.remove(id);
        //si no existe, devuelve null, mejor Optional<Worker>
    }

    /*public boolean updateTypeWorkOfWorkerByID(String id, TypeWorker typeWorker){
        for (String idWorker : workers.keySet())
            if (idWorker.equalsIgnoreCase(id)) {
                workers.get(idWorker).setTypeWorker(typeWorker);
                return true;
            }
        return false;
    }
    public Worker updateTypeWorkOfWorkerByID(String id, TypeWorker typeWorker){
        if (workers.containsKey(id)) {
            workers.get(id).setTypeWorker(typeWorker);
            return workers.get(id);
        }
        return null;

    }*/
    public Optional<Worker> updateTypeWorkOfWorkerByID(String id, TypeWorker typeWorker) {
        if (workers.containsKey(id)) {
            workers.get(id).setTypeWorker(typeWorker);
            return Optional.of(workers.get(id));
        }
        return Optional.empty();
    }

    public Optional<Worker> getWorkerById(String id) {
        if (workers.containsKey(id))
            return Optional.of(workers.get(id));
        return Optional.empty();
    }

    public List<Worker> getAllWorkers() {
        return workers.values().stream().
               // peek(System.out::println).
                toList();
    }

    //resto de métodos, usando Stream
    /*private Worker getOlderWorker() { //devuelve el mas viejo, mas años
        return workers.values().stream().
                max(Comparator.comparing(Person::getAge)).get();
    }*/

    /*private Worker getOldestWorker() { //devuelve el que tiene más años trabajados
        return workers.values().stream().
                min(Comparator.comparing(Worker::getStartDay)).get();
    }*/

    //los metodos anteriores no son adecuados, se puede dar el caso de que tengamos
    //varios trabajadores con la misma edad o con la misma antigüedad
    //convertimos los dos  metodos de arriba en privados para obtener
    //la edad de cualquiera de los mayores y la fecha de incorporación de cualquiera
    //de los trabajadores antiguos
    /*public List<Worker> getOlderWorkers() {
        int oldAge = getOlderWorker().getAge();
        return workers.values().stream().
                filter(worker -> worker.getAge() == oldAge).
                toList();
    }*/
    /*public List<Worker> getOldestWorkers() {
        LocalDate oldStarDay = getOldestWorker().getStartDay();
        return workers.values().stream().
                filter(worker -> worker.getStartDay().equals(oldStarDay)).
                toList();
    }*/
   /* public double getTotalSalary() {
        return workers.values().stream().
                mapToDouble(Worker::getSalary).
                sum();
    }*/
    //vamos a devolver una lista con los apellidos de los trabajadores,
    //en función de la especialidad, ordenada alfabeticamente
    /*public List<String> getSurnamesOfWorkersBySpecialist(TypeWorker typeWorker) {
        return workers.values().stream().
                filter(worker -> worker.getTypeWorker().equals(typeWorker)).
                map(Person::getSurname).
                sorted().
                toList();
    }*/
}













