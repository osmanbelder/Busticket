package com.osmanbelder.busticketsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "busCrew")
@Data
public class BusCrew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String busCrewDriverName;

    private String busCrewDriverAssistantName;
}
