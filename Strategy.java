package CogRob;

public interface Strategy {
	/*****Strategy*****
	 * Interface so every made strategy can easily be switched out with one another without having to pre-define them.
	 */
	
	public abstract void startStrategy(Robot robot);
}
