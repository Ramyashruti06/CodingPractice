package codetalksdna.ExceptionClassPrograms;

public class YoungAgeException extends RuntimeException {

    YoungAgeException(String message) {
        // Super keywords simply means calling parent class constructor.
        super(message);
    }
}
