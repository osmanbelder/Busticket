package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.BusDTO;
import com.osmanbelder.busticketsystem.model.Bus;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusMapper {
    @Named("toBus")
    Bus toBus(BusDTO busDTO);

    @Named("toBusDTO")
    BusDTO toBusDTO(Bus bus);

    @IterableMapping(qualifiedByName = "toBus")
    List<Bus> toBusList(List<BusDTO> busDTOList);

    @IterableMapping(qualifiedByName = "toBusDTO")
    List<BusDTO> toBusDTOList(List<Bus> busList);
}
