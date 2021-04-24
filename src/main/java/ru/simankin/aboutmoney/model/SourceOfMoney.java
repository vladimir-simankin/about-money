package ru.simankin.aboutmoney.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class SourceOfMoney implements Serializable {

    @Id
    @SequenceGenerator(name = "source_of_money_sequence_generator", sequenceName = "source_of_money_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "source_of_money_sequence_generator")
    private Long id;

    @NonNull
    private String name;
}
