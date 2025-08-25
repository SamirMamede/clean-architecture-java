package dev.java.ArchClean.infra.persistence;

import dev.java.ArchClean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Events")
public class EventEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "identificador", nullable = false)
    private String identificador;

    @Column(name = "data_inicio", nullable = false)
    private LocalDateTime dataInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDateTime dataFim;

    @Column(name = "local_evento", nullable = false)
    private String local;

    @Column(name = "capcidade", nullable = false)
    private Integer capacidade;

    @Column(name = "organizador", nullable = false)
    private String organizador;


    @Column(name = "tipo", nullable = false, columnDefinition = "event_type")
    @Enumerated(EnumType.STRING)
    private EventType tipo;
}
