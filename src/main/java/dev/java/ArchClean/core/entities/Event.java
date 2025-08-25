package dev.java.ArchClean.core.entities;

import dev.java.ArchClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime data_inicio,
        LocalDateTime data_fim,
        String local_evento,
        Integer capacidade,
        String organizador,
        EventType tipo
) {
    public Event {
        if (identificador == null || identificador.isBlank()) {
            throw new IllegalArgumentException("Identificador não pode ser nulo ou vazio.");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descrição não pode ser nulo, ou vazio.");
        }
        if (local_evento == null || local_evento.isBlank()) {
            throw new IllegalArgumentException("Local não pode ser nulo, ou vazio.");
        }
        if (capacidade < 0){
            throw new IllegalArgumentException("Capacidade não podeser igual a 0.");
        }
        if (organizador == null || organizador.isBlank()) {
            throw new IllegalArgumentException("Organizador não pode ser nulo, ou vazio.");
        }
        if (data_inicio == null || data_fim == null || data_inicio.isAfter(data_fim)){
            throw new IllegalArgumentException("Datas inválidas: início deve ser antes do fim.");
        }
    }
}
