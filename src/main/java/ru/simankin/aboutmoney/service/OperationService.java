package ru.simankin.aboutmoney.service;

import java.util.List;
import ru.simankin.aboutmoney.model.Operation;
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.model.type.Type;

public interface OperationService {

    Operation createOperation(Operation income);

    Operation updateOperation(Operation income);

    void deleteOperation(Operation income);

    List<Operation> getAll();

    Operation getOperationById(Long id);

    List<Operation> getOperationByType(Type type);

    List<Operation> getOperationByTypeAndSourceOfMoney(Type type, SourceOfMoney sourceOfMoney);
}
