package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
@Entity
public class Movimentacao {


        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public class MovimentacaoId implements Serializable{
            private long idMovimento;
            private long idUsuario;
        }
        @EmbeddedId
        private MovimentacaoId id;
        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodo;
        private Ocorrencia ocorrencia;
        private Calendario calendario;

}
