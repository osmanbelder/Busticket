package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.BusSchedulesDTO;
import com.osmanbelder.busticketsystem.model.BusSchedules;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusSchedulesMapper {
    @Named("toBusSchedules")
    BusSchedules toBusSchedules(BusSchedulesDTO busSchedulesDTO);

    @Named("toBusSchedulesDTO")
    BusSchedulesDTO toBusSchedulesDTO(BusSchedules busSchedules);

    @IterableMapping(qualifiedByName = "toBusSchedules")
    List<BusSchedules> toBusSchedulesList(List<BusSchedulesDTO> busSchedulesDTOList);

    @IterableMapping(qualifiedByName = "toBusSchedulesDTO")
    List<BusSchedulesDTO> toBusSchedulesDTOList(List<BusSchedules> busSchedulesList);
}
