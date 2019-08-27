package com.osmanbelder.busticketsystem.dto;

import lombok.Data;
import java.util.Date;

import java.util.List;

@Data
public class CompanyDTO {

    private Long id;

    private String companyName;

    private Date companyEstablishmentDate;

    private List<BusDTO> bus;
}
