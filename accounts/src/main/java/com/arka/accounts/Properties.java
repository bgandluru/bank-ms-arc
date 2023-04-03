package com.arka.accounts;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Properties {

    private String env;

    public Properties(String env) {
        this.env = env;
    }
}
