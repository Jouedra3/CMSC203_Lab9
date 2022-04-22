/*
 * @author: Josue Delwende Ouedraogo
 * CMSC 203
 * 
 */
public class SavingsAccount extends BankAccount {
        private double rate;
        private int savingsNumber;
        private String accountNumber;

        public SavingsAccount(String name, double amount) {
                super(name, amount);
                savingsNumber = 0;
                accountNumber = super.getAccountNumber() + "-" + Integer.toString(savingsNumber);
        }

        public SavingsAccount(SavingsAccount oldAccount, double amount) {
                super(oldAccount, amount);
                savingsNumber = oldAccount.savingsNumber + 1;
                accountNumber = super.getAccountNumber() + "-" + Integer.toString(savingsNumber);
        }
        /**
         * @return the accountNumber
         */
        public String getAccountNumber() {
                return accountNumber;
        }
        /**
         * @return the savingsNumber
         */
        public int getSavingsNumber() {
                return savingsNumber;
        }

        void postInterest() {
                deposit((rate / (double) 12) * getBalance());
        }

        /**
         * @param savingsNumber the savingsNumber to set
         */
        public void setSavingsNumber(int savingsNumber) {
                this.savingsNumber = savingsNumber;
        }

}







