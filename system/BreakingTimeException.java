package system;

@SuppressWarnings("serial")
public class BreakingTimeException extends Exception {

	public String getMessage() {
		return "Data de Sa�da menor do que a Data de Entrada!";
	}
	
}
