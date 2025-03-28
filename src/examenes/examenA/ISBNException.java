package examenes.examenA;

public class ISBNException extends Exception{
    @Override
    public String getMessage() {
        return "ISBN ERRÓNEO";
    }
}
