package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.BusCrewDTO;
import com.osmanbelder.busticketsystem.model.Bus;
import com.osmanbelder.busticketsystem.model.BusCrew;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusCrewMapper {
    @Named("toBusCrew")
    BusCrew toBusCrew(BusCrewDTO busCrewDTO);

    @Named("toBusCrewDTO")
    BusCrewDTO toBusCrewDTO(BusCrew busCrew);

    @IterableMapping(qualifiedByName = "toBusCrew")
    List<BusCrew> toBusCrewList(List<BusCrewDTO> busCrewDTOList);

    @IterableMapping(qualifiedByName = "toBusCrewDTO")
    List<BusCrewDTO> toBusCrewDTOList(List<BusCrew> busCrewList);
}
