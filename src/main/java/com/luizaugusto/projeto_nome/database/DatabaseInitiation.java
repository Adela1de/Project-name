package com.luizaugusto.projeto_nome.database;

import com.luizaugusto.projeto_nome.entities.Information;
import com.luizaugusto.projeto_nome.entities.User;
import com.luizaugusto.projeto_nome.repositories.InformationRepository;
import com.luizaugusto.projeto_nome.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@RequiredArgsConstructor
@Service
public class DatabaseInitiation {

    private final InformationRepository informationRepository;
    private final UserRepository userRepository;


    public void dbInit()
    {
        var user1 = new User(null,"Rog@Rog.com","6666", false);
        var user2 = new User(null,"Nat@Nat.com","3104", true);
        var user3 = new User(null,"joao@joao.com","coxinha123", false);
        var user4 = new User(null,"luiz@luiz.com","@gbhr79AR1", true);
        var user5 = new User(null,"Rob@Rob.com","@gbhr79AR1", false);
        var user6 = new User(null,"Forger@Loid.com","6510", true);
        var user7 = new User(null,"Anya@Forger.com","cringelord123", false);
        var user8 = new User(null,"teste@teste.com","tester", true);
        var user9 = new User(null,"testee@testee.com","tester", false);
        var user10 = new User(null,"testeee@testeeee.com","testeeer", true);

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));

        var info1 = new Information(null, "Rogerinho Doideira", 30);
        var info2 = new Information(null, "Nathalia Adelaide", 24);
        var info3 = new Information(null, "João Leal", 23);
        var info4 = new Information(null, "Luiz Augusto", 22);
        var info5 = new Information(null, "Roberto", 45);
        var info6 = new Information(null, "Loid Forger", 31);
        var info7 = new Information(null, "Anya Forger", 6);

        informationRepository.saveAll(Arrays.asList(info1, info2, info3, info4, info5, info6, info7));

        user1.setInformation(info1);
        user2.setInformation(info2);
        user3.setInformation(info3);
        user4.setInformation(info4);
        user5.setInformation(info5);
        user6.setInformation(info6);
        user7.setInformation(null);
        user8.setInformation(null);
        user9.setInformation(null);
        user10.setInformation(info7);

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10));
    }
}
