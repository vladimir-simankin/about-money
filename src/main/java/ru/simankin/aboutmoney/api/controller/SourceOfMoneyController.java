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
import ru.simankin.aboutmoney.model.SourceOfMoney;
import ru.simankin.aboutmoney.service.SourceOfMoneyService;
import ru.simankin.aspect.logging.annotation.Logging;

@RestController
@RequiredArgsConstructor
public class SourceOfMoneyController {

    private final SourceOfMoneyService sourceOfMoneyService;

    @Logging
    @GetMapping("source-of-money/all")
    public List<SourceOfMoney> getAllCategories() {
        return sourceOfMoneyService.getAll();
    }

    @Logging
    @GetMapping("source-of-money/source-of-money-by-name")
    public @ResponseBody
    SourceOfMoney getSourceOfMoneyByName(
            @RequestParam("name") String name
    ) {
        return sourceOfMoneyService.getSourceOfMoneyByName(name);
    }

    @Logging
    @GetMapping("source-of-money/source-of-money-by-id")
    public @ResponseBody
    SourceOfMoney getSourceOfMoneyById(
            @RequestParam("id") Long id
    ) {
        return sourceOfMoneyService.getSourceOfMoneyById(id);
    }

    @Logging
    @PostMapping("source-of-money/create")
    public SourceOfMoney createSourceOfMoney(
            @RequestBody SourceOfMoney sourceOfMoney
    ) {
        return sourceOfMoneyService.createSourceOfMoney(sourceOfMoney);
    }

    @Logging
    @PutMapping("source-of-money/update")
    public SourceOfMoney updateSourceOfMoney(
            @RequestBody SourceOfMoney sourceOfMoney
    ) {
        return sourceOfMoneyService.updateSourceOfMoney(sourceOfMoney);
    }

    @Logging
    @DeleteMapping("source-of-money/delete")
    public void deleteSourceOfMoney(
            @RequestBody SourceOfMoney sourceOfMoney
    ) {
        sourceOfMoneyService.deleteSourceOfMoney(sourceOfMoney);
    }
}
