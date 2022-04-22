/*
 * @author: Josue Delwende Ouedraogo
 * CMSC 203
 * 
 */
/**Defines any type of bank account*/
public abstract class BankAccount {
	
	/**class variable so that each account has a unique number*/
		protected static int numberOfAccount = 100001;
        private double balance;
        private String owner;
        private String accountNumber;
       
    	/**default constructor*/
        public BankAccount() {
                balance = 0;
                owner = "";
                accountNumber = Integer.toString(numberOfAccount++);
        }
        
        /**standard constructor
    	@param name the owner of the account
    	@param amount the beginning balance*/

        public BankAccount(String name, double balance ) {
                owner = name;
                setBalance(balance);
                accountNumber = Integer.toString(numberOfAccount++);
        }
        
        public BankAccount(BankAccount old,     double balance ) {
                owner = old.owner;
                setBalance(balance);
                accountNumber = old.accountNumber;
        }
        
        void deposit(double b) {
                if(b>=0) {
                        balance += b;
                }
        }
        
        /**allows you to remove money from the account if
    	enough money is available,returns true if the transaction was
    	completed, returns false if the there was not enough money.
    	@param amount  the amount to withdraw from the account
    	@return true if there was sufficient funds to complete
    	the transaction, false otherwise*/

       public boolean withdraw(double amount) {
    	   		boolean completed = true;
                if(amount <=0) {
                        balance = balance - amount;
                        
                }else {
                	completed = false;
                }
                        return completed;
                }
        
       /**accessor method to balance
   	@return the balance of the account*/

        public double getBalance() {
                return balance;
        }

    	/**mutator method to change the balance
    	@param newBalance the new balance for the account*/

        public void setBalance(double balance) {
                this.balance = balance;
        }
        
        /**accessor method to owner
    	@return the owner of the account*/


        public String getOwner() {
                return owner;
        }
        
        /**accessor method to account number
    	@return the account number*/

        public String getAccountNumber() {
                return accountNumber;
        }
        
        /**mutator method to change the account number
    	@param newAccountNumber the new account number*/

        public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
        }
        
        
}
