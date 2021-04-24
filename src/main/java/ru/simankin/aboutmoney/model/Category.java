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
import ru.simankin.aboutmoney.model.type.Type;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Category implements Serializable {

    @Id
    @SequenceGenerator(name = "category_sequence_generator", sequenceName = "category_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence_generator")
    private Long id;

    @NonNull
    private String name;
}
