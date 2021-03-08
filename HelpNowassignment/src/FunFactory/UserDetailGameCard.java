package FunFactory;


public class UserDetailGameCard implements Comparable<UserDetailGameCard>
{
	int gcId; //game card id
	char user; //Existing user or new user
	int gcBalance; //current balance
	int start; //start game from 1 to 10 or from 10 to 1
	
	
	
	/**
	 * @return the gcId
	 */
	public int getGcId() {
		return gcId;
	}



	/**
	 * @param gcId the gcId to set
	 */
	public void setGcId(int gcId) {
		this.gcId = gcId;
	}



	/**
	 * @return the user
	 */
	public char getUser() {
		return user;
	}



	/**
	 * @param user the user to set
	 */
	public void setUser(char user) {
		this.user = user;
	}



	/**
	 * @return the gcBalance
	 */
	public int getGcBalance() {
		return gcBalance;
	}



	/**
	 * @param gcBalance the gcBalance to set
	 */
	public void setGcBalance(int gcBalance) {
		this.gcBalance = gcBalance;
	}



	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}



	/**
	 * @param start the start to set
	 */
	public void setStart(int start) {
		this.start = start;
	}



	/**
	 * @param gcId
	 * @param user
	 * @param gcBalance
	 * @param start
	 */
	public UserDetailGameCard(int gcId, char user, int gcBalance, int start) {
		this.gcId = gcId;
		this.user = user;
		this.gcBalance = gcBalance;
		this.start = start;
	}



	@Override
	public int compareTo(UserDetailGameCard o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
