package pl.waw.sgh.BANK;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customerList=" + customerList +
                ", accountList=" + accountList +
                '}';
    }
}
