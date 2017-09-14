package CogRob;

public interface Robot {
	/*****ROBOT*****
	 * Interface so every custom-made robot can easily be switched out with one another without having to pre-define them.
	 * Any function put in here has to be implemented in every Robot that uses this interface.
	 */
	
	public void runStrategy();
}
