package dev.java.ArchClean.infra.dtos;

import dev.java.ArchClean.core.enums.EventType;

import java.time.LocalDateTime;

public record EventDto(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime  data_inicio,
        LocalDateTime data_fim,
        String local_evento,
        Integer capacidade,
        String organizador,
        EventType tipo

) {
}
