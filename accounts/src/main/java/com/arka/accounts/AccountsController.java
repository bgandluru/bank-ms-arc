package com.arka.accounts;

import com.arka.accounts.AccountServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    final AccountServiceConfig accountConfig;

    public AccountsController(AccountServiceConfig accountConfig) {
        this.accountConfig = accountConfig;
    }


    @GetMapping("/getConfigs")
    String getMapping(){
     return accountConfig.getEnv();
    }


}
