package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
@Entity
public class Calendario {
    @Id
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dateEspecial;
}
