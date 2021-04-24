package ru.simankin.aboutmoney.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import ru.simankin.aboutmoney.model.type.Type;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Operation implements Serializable {

    @Id
    @SequenceGenerator(name = "operation_sequence_generator", sequenceName = "operation_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "operation_sequence_generator")
    private Long id;

    @NonNull
    private LocalDateTime date;

    @NonNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category", referencedColumnName = "id")
    private Category category;

    @NonNull
    private Integer amount;

    @NonNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_of_money", referencedColumnName = "id")
    private SourceOfMoney sourceOfMoney;

    @NonNull
    private Type type;
}
