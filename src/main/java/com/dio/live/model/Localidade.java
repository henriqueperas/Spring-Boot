package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
@Entity
public class Localidade {
    @Id
    private long id;
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
