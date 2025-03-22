package teoria.interfaces.ejemplo;

public class TypeWorkerException extends Exception{
    @Override
    public String getMessage() {
        return "error in type worker";
    }
}
