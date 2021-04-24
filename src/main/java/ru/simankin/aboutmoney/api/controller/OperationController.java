package ru.simankin.aboutmoney.api.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.simankin.aboutmoney.model.Operation;
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.model.type.Type;
import ru.simankin.aboutmoney.service.OperationService;
import ru.simankin.aspect.logging.annotation.Logging;

@RestController
@RequiredArgsConstructor
public class OperationController {

    private final OperationService operationService;

    @Logging
    @GetMapping("operation/all")
    public List<Operation> getAllOperations() {
        return operationService.getAll();
    }

    @Logging
    @GetMapping("operation/operation-by-type")
    public @ResponseBody
    List<Operation> getOperationByType(
            @RequestParam("type") Type type
    ) {
        return operationService.getOperationByType(type);
    }

    @Logging
    @GetMapping("operation/operation-by-type-and-source-of-money")
    public @ResponseBody
    List<Operation> getOperationByTypeAndSourceOfMoney(
            @RequestParam("type") Type type,
            @RequestParam("sourceOfMoney") SourceOfMoney sourceOfMoney
    ) {
        return operationService.getOperationByTypeAndSourceOfMoney(type, sourceOfMoney);
    }

    @Logging
    @GetMapping("operation/operation-by-id")
    public @ResponseBody
    Operation getOperationById(
            @RequestParam("id") Long id
    ) {
        return operationService.getOperationById(id);
    }

    @Logging
    @PostMapping("operation/create")
    public Operation createOperation(
            @RequestBody Operation operation
    ) {
        return operationService.createOperation(operation);
    }

    @Logging
    @PutMapping("operation/update")
    public Operation updateOperation(
            @RequestBody Operation operation
    ) {
        return operationService.updateOperation(operation);
    }

    @Logging
    @DeleteMapping("operation/delete")
    public void deleteOperation(
            @RequestBody Operation operation
    ) {
        operationService.deleteOperation(operation);
    }
}
