package interfaces;

public interface Validatable<T> {
    void validate(T entity) throws Exception;

    default void printValidationStart() {
        System.out.println("Starting validation process...");
    }

    static boolean isNotNull(Object obj) {
        return obj != null;
    }
}