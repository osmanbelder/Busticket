package com.osmanbelder.busticketsystem.mapper;

import com.osmanbelder.busticketsystem.dto.BusStationDTO;
import com.osmanbelder.busticketsystem.model.BusStation;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusStationMapper {
    @Named("toBusStation")
    BusStation toBusStation (BusStationDTO busStationDTO);

    @Named("toBusStationDTO")
    BusStationDTO toBusStationDTO (BusStation busStation);

    @IterableMapping(qualifiedByName = "toBusStation")
    List<BusStation> toBusStationList (List<BusStationDTO> busStationDTOList);

    @IterableMapping(qualifiedByName = "toBusStationDTO")
    List<BusStationDTO> toBusStationDTOList (List<BusStation> busStationList);


}
