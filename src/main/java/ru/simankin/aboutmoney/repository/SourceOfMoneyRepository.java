package ru.simankin.aboutmoney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simankin.aboutmoney.model.SourceOfMoney;

@Repository
public interface SourceOfMoneyRepository extends JpaRepository<SourceOfMoney, Long> {

    SourceOfMoney findByName(String name);
}
