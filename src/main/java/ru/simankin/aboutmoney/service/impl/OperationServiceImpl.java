package ru.simankin.aboutmoney.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.simankin.aboutmoney.model.Operation;
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.model.type.Type;
import ru.simankin.aboutmoney.repository.OperationRepository;
import ru.simankin.aboutmoney.service.OperationService;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

    private final OperationRepository operationRepository;

    @Override
    @Transactional
    public Operation createOperation(Operation operation) {
        operation.setDate(LocalDateTime.now());
        return operationRepository.saveAndFlush(operation);
    }

    @Override
    @Transactional
    public Operation updateOperation(Operation operation) {
        return operationRepository.saveAndFlush(operation);
    }

    @Override
    @Transactional
    public void deleteOperation(Operation operation) {
        operationRepository.delete(operation);
    }

    @Override
    @Transactional
    public List<Operation> getAll() {
        return operationRepository.findAll();
    }

    @Override
    @Transactional
    public Operation getOperationById(Long id) {
        return operationRepository.findById(id).get();
    }

    @Override
    @Transactional
    public List<Operation> getOperationByType(Type type) {
        return operationRepository.findAllByType(type);
    }

    @Override
    @Transactional
    public List<Operation> getOperationByTypeAndSourceOfMoney(Type type, SourceOfMoney sourceOfMoney) {
        return operationRepository.findAllByTypeAndSourceOfMoney(type, sourceOfMoney);
    }
}
