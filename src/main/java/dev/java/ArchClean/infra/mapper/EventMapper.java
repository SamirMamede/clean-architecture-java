package dev.java.ArchClean.infra.mapper;

import dev.java.ArchClean.core.entities.Event;
import dev.java.ArchClean.infra.dtos.EventDto;

public class EventMapper {

    public static Event toEntity(EventDto dto) {
        if (dto == null) {
            return  null;
        }
        return new Event(
                dto.id(),
                dto.nome(),
                dto.descricao(),
                dto.identificador(),
                dto.data_inicio(),
                dto.data_fim(),
                dto.local_evento(),
                dto.capacidade(),
                dto.organizador(),
                dto.tipo()

        );
    }

    public static EventDto toDto(Event entity) {
        if (entity == null){
            return null;
        }
        return new EventDto(
                entity.id(),
                entity.nome(),
                entity.descricao(),
                entity.identificador(),
                entity.data_inicio(),
                entity.data_fim(),
                entity.local_evento(),
                entity.capacidade(),
                entity.organizador(),
                entity.tipo()
        );
    }
}
