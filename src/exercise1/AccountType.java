package exercise1;

public class AccountType {

	public static final int REGULAR_ACCOUNT = 0;
	public static final int PREMIUM_ACCOUNT = 1;
	// um novo tipo de conta
	private int accountType;
	
	public boolean isPremium() {
		if (this.accountType == PREMIUM_ACCOUNT)
			return true;
		return false;
	}
	//verifica nova conta 
	//Mover o método para o Account Type - Feature Envy
	// Consider there is additional code here...

}
