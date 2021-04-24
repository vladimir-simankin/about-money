package ru.simankin.aboutmoney.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.simankin.aboutmoney.model.Operation;
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.model.type.Type;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

    List<Operation> findAllByType(Type type);

    List<Operation> findAllByTypeAndSourceOfMoney(Type type, SourceOfMoney sourceOfMoney);
}
