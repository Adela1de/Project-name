package com.luizaugusto.projeto_nome.database;

import com.luizaugusto.projeto_nome.entities.Information;
import com.luizaugusto.projeto_nome.repositories.InformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@RequiredArgsConstructor
@Service
public class DatabaseInitiation {

    private final InformationRepository informationRepository;

    public void dbInit()
    {
        var info1 = new Information(null, "Rogerinho Doideira", 30);
        var info2 = new Information(null, "Nathalia Adelaide", 24);
        var info3 = new Information(null, "João Leal", 23);
        var info4 = new Information(null, "Luiz Augusto", 22);

        informationRepository.saveAll(Arrays.asList(info1, info2, info3, info4));
    }
}
