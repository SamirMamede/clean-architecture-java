package dev.java.ArchClean.core.entities;

import dev.java.ArchClean.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(
        Long id,
        String nome,
        String descricao,
        String identificador,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        String local,
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
        if (local == null || local.isBlank()) {
            throw new IllegalArgumentException("Local não pode ser nulo, ou vazio.");
        }
        if (organizador == null || organizador.isBlank()) {
            throw new IllegalArgumentException("Organizador não pode ser nulo, ou vazio.");
        }
        if (dataInicio == null || dataFim == null || dataInicio.isAfter(dataFim)){
            throw new IllegalArgumentException("Datas inválidas: início deve ser antes do fim.");
        }
    }
}
