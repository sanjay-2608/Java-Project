import java.util.TreeMap;

public class HandleCustomer {

    public boolean validAccountNumber(String accountNumber, TreeMap<String, CustomerDatabase> db){
        if(accountNumber.equals(db.get(accountNumber).getAccountNumber())){
            return true;
        }
        return false;
    }
    public boolean validPinNumber(String accountNumber, String pinNumber, TreeMap<String, CustomerDatabase> db){
        if(pinNumber.equals(db.get(accountNumber).getPinNumber())){
            return true;
        }
        return false;
    }


    public void transferAmount(String fromAccountNumber, String toAccountNumber, int amount, TreeMap<String, CustomerDatabase> db){
        db.get(fromAccountNumber).withdraw(fromAccountNumber, amount, db);
        db.get(toAccountNumber).deposit(toAccountNumber, amount, db);
    }
}
