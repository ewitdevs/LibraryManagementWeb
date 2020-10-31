package com.ewit.librarymanagement.libraryconverter.core;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Converter<T,U> {
    private final Function<T, U> fromDTO;
    private final Function<U,T> fromEntity;

    public Converter(final Function<T, U> fromDTO, final Function<U, T> fromEntity) {
        this.fromDTO = fromDTO;
        this.fromEntity = fromEntity;
    }

    public  U convertFromDTO( T dto){
        return fromDTO.apply(dto);
    }
    
    public  T convertFromEntity( U entity){
        return fromEntity.apply(entity);
    }
    
    public final List<U> createFromDTOs(final Collection<T> dtoS){
      return  dtoS.stream().map(this::convertFromDTO).collect(Collectors.toList());
    }

    public final List<T> createFromEntities(final Collection<U> entities){
        return entities.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }
}
