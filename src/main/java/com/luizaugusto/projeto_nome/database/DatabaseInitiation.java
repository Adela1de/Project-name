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
        var info1 = new Information(null, "Rogerinho Doideira", 30);
        var info2 = new Information(null, "Nathalia Adelaide", 24);
        var info3 = new Information(null, "João Leal", 23);
        var info4 = new Information(null, "Luiz Augusto", 22);
        var info5 = new Information(null, "Roberto", 45);
        var info6 = new Information(null, "Loid Forger", 31);

        informationRepository.saveAll(Arrays.asList(info1, info2, info3, info4, info5, info6));

        var user1 = new User(null, false);
        var user2 = new User(null, true);
        var user3 = new User(null, false);
        var user4 = new User(null, true);
        var user5 = new User(null, false);
        var user6 = new User(null, true);

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6));

        user1.setInformation(info1);
        user2.setInformation(info2);
        user3.setInformation(info3);
        user4.setInformation(info4);
        user5.setInformation(info5);
        user6.setInformation(info6);

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6));
    }
}
