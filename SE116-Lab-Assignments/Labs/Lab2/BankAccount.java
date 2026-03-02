
//What does a constructor do in Java?
//It allows user to build an object from class.

// What is the difference between static and non-static methods/attributes in Java?
// Static --> The methods that used in class instead of object. So for example Math.pow() is a static method. We do not need to create an object for that method it belongs to the class.
// non-static --> Methods that belongs to object rather than class. We need to create an object in order to use those methods. For example new Scanner().nextInt()

public class BankAccount {
    private String ownerName;
    private long iban;
    private int balance;

    public BankAccount(String ownerName, long iban) {
        //check iban
        if (!isIbanValid(iban)) {throw new IllegalArgumentException();}

        this.ownerName = ownerName;
        this.iban = iban;
        this.balance = 0;
    }

    //Testing Things
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Murat", 11212511251L);
        bankAccount1.deposit(10000);
        bankAccount1.displayAccountInfo();
        bankAccount1.sendMoney(100, 11112511251L);
        bankAccount1.displayAccountInfo();

        BankAccount bankAccount2 = new BankAccount("Sude", 12634636224L);
        bankAccount2.withdraw(10); //should give error
    }

    private boolean isIbanValid(long iban) {
        // checking if it is 11 digits
        int digitCount = 0;
        while (iban > 0 ) {
            digitCount += 1;
            iban = iban / 10;
        }
        return digitCount == 11;
    }

    public int getBalance() {return balance;}

    public long getIban() {return iban;}

    public String getOwnerName() {return ownerName;}

    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}

    public void setIban(long iban) {this.iban = iban;}

    public void setBalance(int balance) {this.balance = balance;}

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0 ) {
            System.out.println("Amount cannot be negative");
            return;
        }

        //checking if balance is enough
        if (balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("Balance is not enough. Balance: " + this.balance + " Requested Amount: " + amount);
        }
    }

    public void sendMoney(int amount, long iban) {
        BankAccount[] accounts = Bank.testAccounts;
        //Check has enough money
        if (this.balance - amount < 0) {
            System.out.println("Balance is not enough. Balance: " + this.balance + " Requested Amount: " + amount);
            return;
        }

        //iterating to find the account
        for (BankAccount account : accounts) {
            if (account.getIban() == iban) {
                //We found the account
                this.withdraw(amount);
                account.setBalance(account.getBalance() + amount);
                return; //no need to loop anymore
            }
        }

        System.out.println("Cannot find the account with that iban: "+ iban);
    }

    public void displayAccountInfo() {
        System.out.println("----------------------------");
        System.out.println("Owner name:" + this.ownerName);
        System.out.println("Balance:" + this.balance);
        System.out.println("Iban:" + this.iban);
        System.out.println("----------------------------");
    }
}

class Bank{
    BankAccount[] bankAccounts;
    int accountCount = 0;
    public static BankAccount[] testAccounts = {new BankAccount("Melih", 11112511251L), new BankAccount("Mert", 12547142553L), new BankAccount("Utkan", 12548453242L)};

    //Not necessary
    public Bank() {
        bankAccounts = new BankAccount[10];
    }

    public void addAccount(BankAccount bankAccount) {

        if (accountCount >= 10) {
            System.out.println("Bank accounts are full!");
            return;
        }

        bankAccounts[accountCount] = bankAccount;
        accountCount += 1;
    }

    public void removeAccount(BankAccount bankAccount) {
        //Remove the account and then reorder the array
        for (int i=0; i<bankAccounts.length; i++) {
            if (bankAccounts[i] == bankAccount) {
                bankAccounts[i] = null;
            }
        }

        //Reordering the array to prevent errors.
        BankAccount[] newBankAccounts = new BankAccount[10];
        int index = 0;
        for (BankAccount iBankAccount : this.bankAccounts) {
            if (bankAccount != null) {
                newBankAccounts[index] = iBankAccount;
                index += 1;
            }
        }

        this.bankAccounts = newBankAccounts;
    }

    public BankAccount[] getBankAccounts() {
        //Return a copy for encapsulation
        BankAccount[] copy = new BankAccount[this.accountCount];

        //We learned it...
        System.arraycopy(this.bankAccounts, 0, copy, 0, this.accountCount);
        return copy;
    }
}

