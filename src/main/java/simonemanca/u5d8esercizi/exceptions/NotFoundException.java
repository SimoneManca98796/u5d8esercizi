package simonemanca.u5d8esercizi.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(int id) {
        super(id + " not found!");
    }
}