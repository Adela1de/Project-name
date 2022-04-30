package com.luizaugusto.projeto_nome.configuration;

import com.luizaugusto.projeto_nome.database.DatabaseInitiation;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@RequiredArgsConstructor
@Profile("test")
public class testConfig {

    private final DatabaseInitiation databaseInitiation;

    @Bean
    public void initBD(){ databaseInitiation.dbInit(); }
}
