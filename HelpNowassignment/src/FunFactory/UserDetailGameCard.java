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
	 */
	public UserDetailGameCard(int gcId, char user) {
		this.gcId = gcId;
		this.user = user;
	}
	
	



	@Override
	public String toString() {
		return "UserDetailGameCard [gcId=" + gcId + ", user=" + user + ", gcBalance=" + gcBalance + ", start=" + start
				+ "]";
	}



	/**
	 * 
	 */
	public UserDetailGameCard() {
	}




	@Override
	public int compareTo(UserDetailGameCard gc) {
		if(gcId>gc.gcId)
			return 1;
		else if(gcId<gc.gcId)
			return -1;
		else
			return 0;
	}

	
}
