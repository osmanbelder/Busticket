package com.osmanbelder.busticketsystem.dto;

import com.osmanbelder.busticketsystem.model.BusStation;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BusSchedulesDTO {

    private Long id;

    private Date busSchedulesDate;

    private List<TicketDTO> ticketList;

    private BusCrewDTO busCrew;

    private BusStationDTO departureBusStation;

    private BusStationDTO arrivalBusStation;



}
