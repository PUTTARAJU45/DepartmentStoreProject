package hmm;

public class InvalidChoiceException extends RuntimeException {
	private String Message;

	public InvalidChoiceException(String message) {
		Message = message;
	}
public String getMessage() {
	return Message;
}

}
