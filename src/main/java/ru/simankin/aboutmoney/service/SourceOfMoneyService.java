package ru.simankin.aboutmoney.service;

import java.util.List;
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.model.type.Type;

public interface SourceOfMoneyService {

    SourceOfMoney createSourceOfMoney(SourceOfMoney sourceOfMoney);

    SourceOfMoney updateSourceOfMoney(SourceOfMoney sourceOfMoney);

    void deleteSourceOfMoney(SourceOfMoney sourceOfMoney);

    List<SourceOfMoney> getAll();

    SourceOfMoney getSourceOfMoneyById(Long id);

    SourceOfMoney getSourceOfMoneyByName(String name);
}
