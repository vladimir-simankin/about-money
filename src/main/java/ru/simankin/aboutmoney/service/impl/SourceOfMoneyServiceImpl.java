package ru.simankin.aboutmoney.service.impl;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.model.type.Type;
import ru.simankin.aboutmoney.repository.SourceOfMoneyRepository;
import ru.simankin.aboutmoney.service.SourceOfMoneyService;

@Service
@RequiredArgsConstructor
public class SourceOfMoneyServiceImpl implements SourceOfMoneyService {

    private final SourceOfMoneyRepository sourceOfMoneyRepository;

    @Override
    @Transactional
    public SourceOfMoney createSourceOfMoney(SourceOfMoney sourceOfMoney) {
        return sourceOfMoneyRepository.saveAndFlush(sourceOfMoney);
    }

    @Override
    @Transactional
    public SourceOfMoney updateSourceOfMoney(SourceOfMoney sourceOfMoney) {
        return sourceOfMoneyRepository.saveAndFlush(sourceOfMoney);
    }

    @Override
    @Transactional
    public void deleteSourceOfMoney(SourceOfMoney sourceOfMoney) {
        sourceOfMoneyRepository.delete(sourceOfMoney);
    }

    @Override
    @Transactional
    public List<SourceOfMoney> getAll() {
        return sourceOfMoneyRepository.findAll();
    }

    @Override
    @Transactional
    public SourceOfMoney getSourceOfMoneyById(Long id) {
        return sourceOfMoneyRepository.findById(id).get();
    }


    @Override
    @Transactional
    public SourceOfMoney getSourceOfMoneyByName(String name) {
        return sourceOfMoneyRepository.findByName(name);
    }
}
