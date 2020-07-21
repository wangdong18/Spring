package proxy.use.xml.impl;

import proxy.use.xml.AccountService;

/**
 * @author mortal
 * @since 2020-07-20
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public void createAccount() {
        System.out.println("create account ");
    }

    @Override
    public void updateAccount(int count) {
        System.out.println("update account ");
    }

    @Override
    public String deleteAccount() {
        System.out.println("delete account ");
        return "";
    }
}
