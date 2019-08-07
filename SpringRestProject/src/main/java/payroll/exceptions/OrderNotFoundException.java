package payroll.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Can't find order " + id);
    }
}
