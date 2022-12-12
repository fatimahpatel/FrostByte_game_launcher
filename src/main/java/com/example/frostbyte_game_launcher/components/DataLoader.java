package com.example.frostbyte_game_launcher.components;

import com.example.frostbyte_game_launcher.models.Account;
import com.example.frostbyte_game_launcher.repositories.AccountRepository;
import com.example.frostbyte_game_launcher.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    GameRepository gameRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //Account Creation
        Account accountOne = new Account("Will Stanistreet", "12345", "01/01/1942", "will@will.com" );
        accountRepository.save(accountOne);

    }

}