package com.future.god.Business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Console;

@Component
public class ConfigTest {
    @Value("${name}")
    private String name;

    public void printName(){

        Console console = System.console();
        if (null != console)
            console.printf(name);
    }
}
