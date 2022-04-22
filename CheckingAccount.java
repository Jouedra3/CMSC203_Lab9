/*
 * @author: Josue Delwende Ouedraogo
 * CMSC 203
 * 
 */
public class CheckingAccount extends BankAccount{
        static final int FEE = 10;

        public CheckingAccount(String name,double amount) {
        	
                super(name, amount);
                
                setAccountNumber(getAccountNumber()+"-15");
        }
        
        @Override
        public boolean withdraw(double amount) {
        	
                amount += FEE;
                
                return super.withdraw(amount);
        }
}
